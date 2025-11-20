package org.example.kkrproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableController {

    @GetMapping("/table")
    public String table() {
        return "Tablepage"; // Tablepage.html
    }
}
