package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.models.Task;
import ru.itpark.service.TaskService;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskService service;
    //и как до этого додуматься??????????????????????????????
    @GetMapping("/tasks/show")
    public String getTasks(@ModelAttribute("model")ModelMap model) {
        List<Task> tasks = service.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @GetMapping("/tasks/add")
    public String addCoast(@RequestParam("time") String time,
                           @RequestParam("text") String text) {
        service.addTask(new Task(time, text));
        return "redirect:/tasks/show";
    }
}
