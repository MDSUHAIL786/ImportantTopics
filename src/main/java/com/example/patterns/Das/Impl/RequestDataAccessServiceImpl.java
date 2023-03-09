package com.example.patterns.Das.Impl;

import com.example.patterns.Das.Entity.DocDigiRequest;
import com.example.patterns.Das.Entity.RequestStatusHistory;
import com.example.patterns.Das.RequestDataAccessService;
import com.example.patterns.Das.Respository.DocDigiRequestRepository;
import com.example.patterns.Das.Respository.RequestStatusHistoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
public class RequestDataAccessServiceImpl implements RequestDataAccessService {

    @Autowired
    private RequestStatusHistoryRepository historyRepository;


    @Autowired
    private DocDigiRequestRepository requestRepository;

    @Override
    public void saveRequestStatusHistory(String status, Integer requestId) {
        RequestStatusHistory requestStatusHistory = RequestStatusHistory.builder().status(status).
                requestId(requestId).createdDt(new Date()).build();
        historyRepository.saveAndFlush(requestStatusHistory);
    }

    @Override
    public void updateRequestStatus(String status, Integer requestId) {
        requestRepository.updateRequestStatus(status, requestId, new Date());
    }

    @Override
    public void updateDocumentLocation(String documentLocation, Integer requestId) {
        requestRepository.updateDocumentLocation(documentLocation, requestId, new Date());
    }

    @Override
    public DocDigiRequest saveAndGetDocDigiRequest(DocDigiRequest docDigiRequest) {
        return requestRepository.save(docDigiRequest);
    }

    @Override
    public void updateErrorMessage(String errorMessage, Integer requestId) {
        requestRepository.updateErrorMessage(errorMessage, requestId, new Date());
    }

    @Override
    public void updateRequestStatusAndSaveStatusHistory(String currentStatus, String previousStatus, Integer requestId) {
        requestRepository.updateRequestStatus(currentStatus, requestId, new Date());
        saveRequestStatusHistory(previousStatus, requestId);
    }

    @Override
    public DocDigiRequest getDocDigiRequestByRequestId(Integer requestId) {
        return requestRepository.getDocDigiRequestByRequestId(requestId);
    }

}
