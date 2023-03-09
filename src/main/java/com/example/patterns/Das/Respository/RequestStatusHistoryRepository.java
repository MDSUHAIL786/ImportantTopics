package com.example.patterns.Das.Respository;

import com.example.patterns.Das.Entity.RequestStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestStatusHistoryRepository extends JpaRepository<RequestStatusHistory,Integer> {
}
