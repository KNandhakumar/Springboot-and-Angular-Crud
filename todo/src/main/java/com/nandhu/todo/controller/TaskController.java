package com.nandhu.todo.controller;

import com.nandhu.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nandhu.todo.model.Task;

import java.util.ArrayList;
import java.util.List;
import com.nandhu.todo.repository.TaskRepository;

@RestController
@CrossOrigin // this annotation use for access springboot server in frontend
@RequestMapping("/api/tasks") //this method use for request mapping to all the post , get don't want to give the path
public class TaskController {

    @Autowired // this annotation use for initialize object
    private TaskRepository taskRepository;

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello world";
    }

    @PostMapping
    public Task createTask(@RequestBody Task task){
        taskRepository.save(task); // this method for save database
        return task;
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskRepository.findAll(); // this method for get all data for database
    }

    @PutMapping("/{id}") // this brace value is dynamic so give this path {id}
    public Task updateTask(@PathVariable Long id, @RequestBody Task task){ // this annotation use for parameter passed id value get this path variable annotation
        task.setId(id);
        return taskRepository.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskRepository.deleteById(id);
    }
}
