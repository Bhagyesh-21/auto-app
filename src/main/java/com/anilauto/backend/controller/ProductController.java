//package com.anilauto.backend.controller;
//
//import com.anilauto.backend.model.Product;
//import com.anilauto.backend.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/products")
//@CrossOrigin
//public class ProductController {
//
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping
//    public List<Product> getAll() {
//        return productService.getAll();
//    }
//
//    @PostMapping
//    public Product create(@RequestBody Product product) {
//        return productService.save(product);
//    }
//    
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        service.delete(id);
//    }
//
//}
//	
















package com.anilauto.backend.controller;

import com.anilauto.backend.model.Product;
import com.anilauto.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired private ProductService service;

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Product save(@RequestBody Product p) {
        return service.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
