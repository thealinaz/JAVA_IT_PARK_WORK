package main.models.base;

import main.models.base.Category;

import java.util.List;

/**
 * Created by Алина on 27.05.2017.
 */
public class Goal {
    private Category category;
    private int priority;
    private String name;
    private List<Note> description;
    private List<Task> tasks;

    public Goal(Category category, int priority, String name, List<Note> description, List<Task> tasks) {
        this.category = category;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Note> getDescription() {
        return description;
    }

    public void setDescription(List<Note> description) {
        this.description = description;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}