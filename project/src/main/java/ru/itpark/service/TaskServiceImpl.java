package ru.itpark.service;

import org.springframework.stereotype.Service;
import ru.itpark.dao.TaskDao;
import ru.itpark.models.Task;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskDao taskDao;

    @Override
    public void addTask(Task task) {
        taskDao.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskDao.findAll();
    }
}
