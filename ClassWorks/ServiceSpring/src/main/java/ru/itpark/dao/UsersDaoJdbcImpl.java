package ru.itpark.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import ru.itpark.models.User;

import javax.sql.DataSource;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersDaoJdbcImpl implements UsersDao {

    private NamedParameterJdbcTemplate template;

    //language=SQL
    private final String SQL_INSERT_USER =
            "INSERT INTO it_park_user(name, age) VALUES(:name, :age)";

    //language=SQL
    private final String SQL_SELECT_USER_BY_ID =
            "SELECT * FROM it_park_user WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_ALL =
            "SELECT * FROM it_park_user";

    //language=SQL
    private final String SQL_DELETE_USER_BY_ID =
            "DELETE FROM it_park_user WHERE id = :id";

    //language=SQL
    private final String SQL_USER_UPDATE_BY_ID =
            "UPDATE it_park_user SET name = :name, age = :age WHERE id = :id";

    public UsersDaoJdbcImpl(DataSource dataSource) {
        this.template = new NamedParameterJdbcTemplate(dataSource);
    }

    public int save(User model) {
        // собрали значения именнованных параметров
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", model.getName());
        params.addValue("age", model.getAge());

        String interestingKeys[] = {"id"};

        // держатель сгенерированного ключа вставленной строки
        KeyHolder holder = new GeneratedKeyHolder();
        template.update(SQL_INSERT_USER, params, holder, interestingKeys);
        Number generatedId = holder.getKey();
        return generatedId.intValue();
    }

    // анонимный класс
    // реализуем интерфейс "на месте"
    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            return new User(id, name, age);
        }
    };

    public User find(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        return template.queryForObject(SQL_SELECT_USER_BY_ID, params, userRowMapper);
    }

    public void update(User model) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", model.getId());
        params.put("name", model.getName());
        params.put("age", model.getAge());
        template.update(SQL_USER_UPDATE_BY_ID, params);
    }

    public void delete(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        template.update(SQL_DELETE_USER_BY_ID, params);
    }

    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL, userRowMapper);
    }
}
