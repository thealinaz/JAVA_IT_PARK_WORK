package ru.itpark.models.base;

import java.util.List;

/**
 * Created by Алина on 01.06.2017.
 */
public class Goal {
    private Category category;
    private int priority; //must be 1-5
    private Text name;
    private Text description;
    private List<Task> tasks;

    public Goal(Category category, int priority, Text name, Text description, List<Task> tasks) {
        this.category = category;
        if (priority >=0 && priority <=5)
            this.priority = priority;
        this.name = name;
        this.description = description;
        this.tasks = tasks;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Text getName() {
        return name;
    }

    public void setName(Text name) {
        this.name = name;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}