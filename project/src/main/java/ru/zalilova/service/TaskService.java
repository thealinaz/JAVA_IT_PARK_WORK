package ru.zalilova.service;

import ru.zalilova.models.Task;

import java.util.List;

public interface TaskService {
    void addTask(Task task);
    List<Task> getAllTasks();
    void deleteAllTasks();
}
