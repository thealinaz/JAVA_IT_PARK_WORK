package ru.zalilova.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zalilova.models.Task;

import java.util.List;

public interface TaskDao extends JpaRepository<Task, Integer> {
    List<Task> findAllByOrderByIdDesc();
}
