package ru.itpark.models.lists;

/**
 * Created by Алина on 01.06.2017.
 */
public abstract class List<T> {
    private List<T> list;

    public List(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
