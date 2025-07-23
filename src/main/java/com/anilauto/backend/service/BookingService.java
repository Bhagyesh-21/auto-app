// BookingService.java
package com.anilauto.backend.service;

import com.anilauto.backend.model.Booking;
import com.anilauto.backend.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {
    @Autowired private BookingRepository repo;
    public List<Booking> getAll() { return repo.findAll(); }
//    public Booking save(Booking b) { return repo.save(b); }
    
    public Booking save(Booking b) {
        if (b.getServices() != null && !b.getServices().isEmpty()) {
            String names = b.getServices().stream()
                    .map(com.anilauto.backend.model.Service::getName)
                    .collect(Collectors.joining(", "));
            b.setServiceNames(names);
        }
        return repo.save(b);
    }
    
    public List<Booking> getByPhone(String phone) {
        return repo.findByPhone(phone);
    }


} 