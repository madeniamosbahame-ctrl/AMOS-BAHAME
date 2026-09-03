package com.example.AMOS.repository;

import com.example.AMOS.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Long> {
    
}

