package com.example.PerformanceCoach.repositories;

import com.example.PerformanceCoach.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {


    User findByUsername(String username);
}
