package ru.itpark.models.base;

/**
 * Created by Алина on 01.06.2017.
 */
public abstract class Category {
    private Text name;

    public Category(Text name) {
        this.name = name;
    }

    public Text getName() {
        return name;
    }

    public void setName(Text name) {
        this.name = name;
    }
}
