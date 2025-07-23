package com.anilauto.backend.controller;

import com.anilauto.backend.model.Booking;
import com.anilauto.backend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired private BookingService service;
    @GetMapping public List<Booking> getAll() { return service.getAll(); }
    @PostMapping public Booking save(@RequestBody Booking b) { return service.save(b); }
    @GetMapping("/by-phone/{phone}")
    public List<Booking> getByPhone(@PathVariable String phone) {
        return service.getByPhone(phone);
    }

}