package com.example.patterns.Das;

import com.example.patterns.Das.Entity.DocDigiRequest;

public interface RequestDataAccessService {
    void saveRequestStatusHistory(String status, Integer requestId);

    void updateRequestStatus(String status, Integer requestId);

    void  updateDocumentLocation(String documentLocation, Integer requestId);

    DocDigiRequest saveAndGetDocDigiRequest(DocDigiRequest docDigiRequest);

    void updateErrorMessage(String errorMessage, Integer requestId);

    void updateRequestStatusAndSaveStatusHistory(String currentStatus , String previousStatus,Integer requestId);

    DocDigiRequest getDocDigiRequestByRequestId(Integer requestId);
}
