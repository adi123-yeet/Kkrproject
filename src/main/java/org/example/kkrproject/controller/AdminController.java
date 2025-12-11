package org.example.kkrproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/adminscherm")
    public String home() {
        return "adminscherm";
    }
}
