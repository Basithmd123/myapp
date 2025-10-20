package com.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello, Aurora! Welcome to Render 🌟");
        return "greet";
    }

    @PostMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Aurora") String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "! 👋");
        return "greet";
    }
}

