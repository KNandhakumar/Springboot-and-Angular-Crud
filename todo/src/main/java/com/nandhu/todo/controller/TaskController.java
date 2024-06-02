package com.nandhu.todo.controller;

import com.nandhu.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nandhu.todo.model.Task;

import java.util.ArrayList;
import java.util.List;
import com.nandhu.todo.repository.TaskRepository;

@RestController
public class TaskController {

    @Autowired // this annotation use for initialize object
    private TaskRepository taskRepository;

    @GetMapping
    public String helloWorld(){
        return "hello world";
    }

    @PostMapping("/api/tasks")
    public Task createTask(@RequestBody Task task){
        taskRepository.save(task);
        return task;
    }
}
