package com.anilauto.backend.service;

import com.anilauto.backend.model.Service;
import com.anilauto.backend.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {
    @Autowired private ServiceRepository repo;
    public List<Service> getAll() { return repo.findAll(); }
    public Service save(Service s) { return repo.save(s); }
}