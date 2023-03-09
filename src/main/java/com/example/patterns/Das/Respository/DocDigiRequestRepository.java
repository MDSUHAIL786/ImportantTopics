package com.example.patterns.Das.Respository;

import com.example.patterns.Das.Entity.DocDigiRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
public interface DocDigiRequestRepository extends JpaRepository<DocDigiRequest, Long> {

    @Query("select request from DocDigiRequest as request where request.requestId = :requestId")
    DocDigiRequest getDocDigiRequestByRequestId(Integer requestId);

    @Transactional
    @Modifying
    @Query("update DocDigiRequest request set request.status = :status ,request.modifiedDt= :modifiedDate where request.requestId = :requestId")
    int updateRequestStatus(String status, Integer requestId, Date modifiedDate);

    @Transactional
    @Modifying
    @Query("update DocDigiRequest request set request.documentLocation = :documentLocation ,request.modifiedDt= :modifiedDate where request.requestId = :requestId")
    int updateDocumentLocation(String documentLocation, Integer requestId, Date modifiedDate);

    @Transactional
    @Modifying
    @Query("update DocDigiRequest request set request.errorMessage = :errorMessage ,request.modifiedDt= :modifiedDate where request.requestId = :requestId")
    int updateErrorMessage(String errorMessage, Integer requestId, Date modifiedDate);


}


