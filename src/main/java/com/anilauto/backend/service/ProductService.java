//package com.anilauto.backend.service;
//
//import com.anilauto.backend.model.Product;
//import com.anilauto.backend.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    public List<Product> getAll() {
//        return productRepository.findAll();
//    }
//
//    public Product save(Product product) {
//        return productRepository.save(product);
//    }
//    
//    public void delete(Long id) {
//        repo.deleteById(id);
//    }
//
//}












package com.anilauto.backend.service;

import com.anilauto.backend.model.Product;
import com.anilauto.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired private ProductRepository repo;

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product save(Product p) {
        return repo.save(p);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
