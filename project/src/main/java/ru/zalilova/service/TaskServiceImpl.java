package ru.zalilova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zalilova.dao.TaskDao;
import ru.zalilova.models.Task;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public void addTask(Task task) {
        taskDao.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskDao.findAllByOrderByIdDesc();
    }

    @Override
    public void deleteAllTasks() {
        taskDao.deleteAllInBatch();
    }
}
