package com.anilauto.backend.service;

import com.anilauto.backend.model.ProductBooking;
import com.anilauto.backend.repository.ProductBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBookingService {
    @Autowired private ProductBookingRepository repo;

    public List<ProductBooking> getAll() {
        return repo.findAll();
    }

    public ProductBooking save(ProductBooking booking) {
        return repo.save(booking);
    }
}
