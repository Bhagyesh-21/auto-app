// controller/UserController.java
package com.anilauto.backend.controller;

import com.anilauto.backend.model.User;
import com.anilauto.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired private UserService service;

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return service.login(user.getMobile(), user.getPassword());
    }
}
