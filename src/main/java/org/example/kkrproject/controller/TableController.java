package org.example.kkrproject.controller;

import org.example.kkrproject.repository.TableRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableController {

    private final TableRepository tableRepo;

    public TableController(TableRepository tableRepo) {
        this.tableRepo = tableRepo;
    }

    @GetMapping("/Table")
    public String showProducts(Model model) {
        model.addAttribute("products", tableRepo.findAll());
        return "Tablepage"; // verwijst naar products.html
    }
}
