//// JwtUtil.java
//package com.anilauto.backend.security;
//
//import io.jsonwebtoken.*;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//public class JwtUtil {
//    private final String SECRET = "anilauto_secret";
//
//    public String generateToken(String mobile) {
//        return Jwts.builder()
//                .setSubject(mobile)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 day
//                .signWith(SignatureAlgorithm.HS256, SECRET)
//                .compact();
//    }
//
//    public String extractMobile(String token) {
//        return Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody().getSubject();
//    }
//
//    public boolean validateToken(String token) {
//        try {
//            Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//}
