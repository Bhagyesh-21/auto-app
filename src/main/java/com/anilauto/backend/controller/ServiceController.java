package com.anilauto.backend.controller;

import com.anilauto.backend.model.Service;
import com.anilauto.backend.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/services")
public class ServiceController {
    @Autowired private ServiceService service;
    @GetMapping public List<Service> getAll() { return service.getAll(); }
    @PostMapping public Service save(@RequestBody Service s) { return service.save(s); }
}