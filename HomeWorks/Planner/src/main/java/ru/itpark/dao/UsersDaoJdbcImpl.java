package ru.itpark.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import ru.itpark.models.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Алина on 02.06.2017.
 */
public class UsersDaoJdbcImpl implements UsersDao{
    private NamedParameterJdbcTemplate template;

    //language=SQL
    private final String SQL_INSERT_USER =
            "INSERT INTO \"user\"(login, password, firstName, lastName, age, email) " +
                    "VALUES(:login, :password, :firstName, :lastName, :age, :email);";

    //language=SQL
    private final String SQL_SELECT_USER_BY_ID =
            "SELECT * FROM \"user\" WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_ALL =
            "SELECT * FROM  \"user\"";

    //language=SQL
    private final String SQL_DELETE_USER_BY_ID =
            "DELETE FROM \"user\" WHERE id = :id";

    //language=SQL
    private final String SQL_USER_UPDATE_BY_ID =
            "UPDATE \"user\" SET login = :login, password = :password, firstName = :firstName, " +
                    "lastName = :lastName, age = :age, email = :email WHERE id = :id";

    public UsersDaoJdbcImpl(DataSource dataSource) {
        this.template = new NamedParameterJdbcTemplate(dataSource);
    }

    public int save(User model) {
        // собрали значения именнованных параметров
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("login", model.getLogin());
        params.addValue("password", model.getPassword());
        params.addValue("firstName", model.getFirstName());
        params.addValue("lastName", model.getLastName());
        params.addValue("age", model.getAge());
        params.addValue("email", model.getEmail());

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
            String login = resultSet.getString("login");
            String password = resultSet.getString("password");
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            int age = resultSet.getInt("age");
            String email = resultSet.getString("email");

            return new User(id, login, password, firstName, lastName, age, email);
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
        params.put("login", model.getLogin());
        params.put("password", model.getPassword());
        params.put("firstName", model.getFirstName());
        params.put("lastName", model.getLastName());
        params.put("age", model.getAge());
        params.put("email", model.getEmail());

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
