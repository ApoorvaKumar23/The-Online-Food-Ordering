package com.example.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.food.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
