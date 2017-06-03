package ru.itpark.dao;

import java.util.List;

/**
 * Created by Алина on 02.06.2017.
 */
public interface BaseCrudDao<T> {
    /**
     * Сохранение объекта в хранилище данных
     * @param model объект, который необходимо сохранить
     * @return идентификатор
     */
    int save(T model);

    /**
     * Получить из хранилища модель по его номеру
     * @param id идентификатор модели
     * @return модель
     */
    T find(int id);

    /**
     * Обновление модели. В model новые данные модели с id из model
     * @param model новые данные модели
     */
    void update(T model);

    /**
     * Удаление данных из хранилища по идентификатору
     * @param id идентификатор модели
     */
    void delete(int id);

    /**
     * Достает ВСЕ данные из хранилища
     * @return список моделей
     */
    List<T> findAll();
}
