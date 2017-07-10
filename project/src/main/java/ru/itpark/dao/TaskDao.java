package ru.itpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.models.Task;

import java.util.List;

public interface TaskDao extends JpaRepository<Task, Integer>{ //че тут
}
