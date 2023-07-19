package com.example.demo.todo.controller.api.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java")
public class JavaTestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
