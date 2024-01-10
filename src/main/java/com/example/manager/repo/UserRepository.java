package com.example.manager.repo;

import com.example.manager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByIdAndPassword(String id, String password);
    boolean existsByEmail(String email);
}
