package ru.itpark.models.base;

/**
 * Created by Алина on 01.06.2017.
 */
public class Task {
    private Text nameOfTask;

    public Task(Text task) {
        this.nameOfTask = task;
    }

    public Text getTask() {
        return nameOfTask;
    }

    public void setTask(Text task) {
        this.nameOfTask = task;
    }
}
