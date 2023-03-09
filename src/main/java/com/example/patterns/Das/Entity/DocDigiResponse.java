package com.example.patterns.Das.Entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "doc_digi_response")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DocDigiResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "response_id", nullable = false)
    private Integer responseId;

    @Column(name = "request_id", nullable = false)
    private Integer requestId;

    @Column(name = "response_uuid", nullable = false)
    private String responseUuid;

    @Column(name = "request_type", nullable = false)
    private String requestType;

    @Column(name = "created_dt", nullable = false)
    private Date createdDt;


    @Column(name = "modified_dt", nullable = false)
    private Date modifiedDt;

    @Column(name = "response_location")
    private String responseLocation;
}
