//// AuthController.java
//package com.anilauto.backend.controller;
//
//import com.anilauto.backend.model.User;
//import com.anilauto.backend.repository.UserRepository;
//import com.anilauto.backend.security.JwtUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/auth")
//@CrossOrigin
//public class AuthController {
//
//    @Autowired private UserRepository userRepo;
//    @Autowired private PasswordEncoder passwordEncoder;
//    @Autowired private JwtService jwtService;
//
//    @PostMapping("/signup")
//    public ResponseEntity<?> signup(@RequestBody User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepo.save(user);
//        return ResponseEntity.ok("User registered successfully");
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody AuthRequest request) {
//        User user = userRepo.findByMobile(request.getMobile());
//        if (user != null && passwordEncoder.matches(request.getPassword(), user.getPassword())) {
//            String token = jwtService.generateToken(user);
//            return ResponseEntity.ok(new AuthResponse(token, user.getFirstName(), user.getId()));
//        }
//        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//    }
//}
