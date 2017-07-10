package ru.itpark.service;

import ru.itpark.models.Task;

import java.util.List;

public interface TaskService {

    void addTask(Task task);
    List<Task> getAllTasks();
}
