package main.dao;

import java.util.List;

/**
 * Created by Алина on 27.05.2017.
 */
public interface BaseDao<T> {
        void save(T model);
        void update(T model);
        void delete(int id);
        T find(int id);

        List<T> findAll();
}
