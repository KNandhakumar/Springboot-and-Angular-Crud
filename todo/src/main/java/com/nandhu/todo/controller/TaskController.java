package com.nandhu.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping
    public String helloWorld(){
        return "hello world";
    }
}
