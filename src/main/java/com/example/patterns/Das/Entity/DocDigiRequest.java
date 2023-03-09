package com.example.patterns.Das.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@Table(name = "doc_digi_request")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocDigiRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id", nullable = false)
    private Integer requestId;

    @Column(name = "uuid", nullable = false)
    private String uuid;

    @Column(name = "client_id", nullable = false)
    private String clientId;


    @Column(name = "extraction_engine", nullable = false)
    private String extractionEngine;

    @Column(name = "document_id", nullable = false)
    private String documentId;

    @Column(name = "document_name")
    private String documentName;

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "request_type",nullable = false)
    private String requestType;

    @Column(name = "status",nullable = false)
    private String status;

    @Column(name = "error_message")
    private String errorMessage;

    @Column(name = "custom_fields")
    private String customFields;

    @Column(name = "extraction_threshold")
    private String extractionThreshold;

    @Column(name = "created_dt", nullable = false)
    private Date createdDt;

    @Column(name = "modified_dt", nullable = false)
    private Date modifiedDt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "document_location")
    private String documentLocation;


}
