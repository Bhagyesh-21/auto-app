package com.anilauto.backend.controller;

import com.anilauto.backend.model.ProductBooking;
import com.anilauto.backend.service.ProductBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/product-bookings")
public class ProductBookingController {
    @Autowired private ProductBookingService service;

    @GetMapping
    public List<ProductBooking> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ProductBooking save(@RequestBody ProductBooking booking) {
        return service.save(booking);
    }
}
