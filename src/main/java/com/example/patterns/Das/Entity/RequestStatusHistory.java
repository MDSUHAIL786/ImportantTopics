package com.example.patterns.Das.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "doc_digi_request_status_history")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestStatusHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "request_id", nullable = false)
    private Integer requestId;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "created_dt", nullable = false)
    private Date createdDt;

    public static RequestStatusHistory populateRequestStatusHistory(Integer requestId, String status) {
        return RequestStatusHistory.builder()
                .requestId(requestId)
                .createdDt(new Date())
                .status(status)
                .build();
    }
}
