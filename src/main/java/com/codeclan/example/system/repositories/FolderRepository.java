package com.codeclan.example.system.repositories;

import com.codeclan.example.system.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
