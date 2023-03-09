package com.example.patterns.Das.Respository;

import com.example.patterns.Das.Entity.DocumentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentTypeRepo extends JpaRepository<DocumentType, Integer> {
}
