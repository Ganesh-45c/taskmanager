package com.ganesh.taskmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String home() {
        return "Welcome to My Task Manager! Git Lesson 2";
    }
}