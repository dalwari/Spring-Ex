package com.examly.springapp.controller;

import com.examly.springapp.Task;
import com.examly.springapp.TaskRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TaskResource {
    @Autowired
    TaskRepository taskRepository;

    @GetMapping(value = "alltasks")
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @PostMapping("/saveTask")
    public List<Task> load(@RequestBody Task task) {
        taskRepository.save(task);
        return taskRepository.findAll();
    }
    @GetMapping("/getTask")
    public Optional<Task> getTaskById(@RequestParam("id") String id){
        return taskRepository.findByTaskId(id);
    }
    @Transactional
    @GetMapping("/deleteTask")
    public List<Task> deleteTask(@RequestParam("id")String id){
        taskRepository.deleteByTaskId(id);
        return taskRepository.findAll();
    }
    @GetMapping("/changeStatus")
    public Optional<Task> updateTask(@RequestParam("id") String id)
    {
        Task task=taskRepository.findByTaskId(id).get();
        String s=task.getTaskStatus().equals("Not In Progress")?"In Progress":"Not In Progress";
        task.setTaskStatus(s);
        taskRepository.save(task);
        return taskRepository.findByTaskId(id);
    }
}
