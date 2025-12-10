package org.example.kkrproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.kkrproject.model.Product;
import org.example.kkrproject.service.ProductService;
import org.example.kkrproject.service.VoorraadService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;   // <-- juiste import!
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final VoorraadService voorraadService;

    @GetMapping("/product/{id}")
    public String productDetail(@PathVariable Integer id, Model model) {
        Product product = productService.findById(id);
        int stock = voorraadService.getTotalStockForProduct(id);

        model.addAttribute("product", product);
        model.addAttribute("stock", stock);

        return "product";
    }
}
