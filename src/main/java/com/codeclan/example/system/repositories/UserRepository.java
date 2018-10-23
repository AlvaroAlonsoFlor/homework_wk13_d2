package com.codeclan.example.system.repositories;

import com.codeclan.example.system.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
