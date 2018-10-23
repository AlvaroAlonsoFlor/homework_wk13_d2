package com.codeclan.example.system.repositories;

import com.codeclan.example.system.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
