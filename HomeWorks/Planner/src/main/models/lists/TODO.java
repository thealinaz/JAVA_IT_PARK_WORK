package main.models.lists;

import main.models.base.Task;

import java.util.List;

/**
 * Created by Алина on 27.05.2017.
 */
public class TODO {
    private List<Task> tasks;

    public TODO(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
