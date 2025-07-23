// service/UserService.java
package com.anilauto.backend.service;

import com.anilauto.backend.model.User;
import com.anilauto.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public User login(String mobile, String password) {
        User u = repo.findByMobile(mobile);
        return (u != null && u.getPassword().equals(password)) ? u : null;
    }
}
