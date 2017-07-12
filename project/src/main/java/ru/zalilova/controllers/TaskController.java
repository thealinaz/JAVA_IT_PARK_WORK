package ru.zalilova.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.zalilova.models.Task;
import ru.zalilova.service.TaskService;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("/tasks/show")
    public String getTasks(@ModelAttribute("model")ModelMap model) {
        List<Task> tasks = service.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @GetMapping("/tasks/add")
    public String addTask(@RequestParam("text") String text,
                           @RequestParam("time") String time) {
        service.addTask(new Task(text, time));
        return "redirect:/tasks/show";
    }

    @GetMapping("/tasks/delete")
    public String deleteTask() {
        service.deleteAllTasks();
        return "redirect:/tasks/show";
    }

}
