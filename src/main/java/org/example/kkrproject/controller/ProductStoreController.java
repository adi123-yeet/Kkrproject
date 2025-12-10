package org.example.kkrproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.kkrproject.model.Bedrijf;
import org.example.kkrproject.model.Product;
import org.example.kkrproject.service.BedrijfService;
import org.example.kkrproject.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;   // <-- juiste import!
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductStoreController {

    private final ProductService productService;
    private final BedrijfService bedrijfService;

    @GetMapping("/product/{id}/stores")
    public String productStores(@PathVariable Integer id, Model model) {
        Product product = productService.findById(id);
        List<Bedrijf> stores = bedrijfService.getStoresByProduct(id);

        model.addAttribute("product", product);
        model.addAttribute("stores", stores);

        return "product-stores";
    }
}
