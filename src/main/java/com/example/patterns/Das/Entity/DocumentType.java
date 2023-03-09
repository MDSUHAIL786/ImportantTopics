package com.example.patterns.Das.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "document_type")
@Data
public class DocumentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "document_type", nullable = false)
    private String documentType;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "created_dt", nullable = false, updatable = false)
    private Date createdDt;

    @Column(name = "modified_dt", nullable = false)
    private Date modifiedDt;
}
