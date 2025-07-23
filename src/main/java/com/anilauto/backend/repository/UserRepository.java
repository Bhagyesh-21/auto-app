//// UserRepository.java
//package com.anilauto.backend.repository;
//
//import com.anilauto.backend.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Optional;
//
//public interface UserRepository extends JpaRepository<User, Long> {
//    Optional<User> findByMobile(String mobile);
//}




// repository/UserRepository.java
package com.anilauto.backend.repository;

import com.anilauto.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByMobile(String mobile);
}
