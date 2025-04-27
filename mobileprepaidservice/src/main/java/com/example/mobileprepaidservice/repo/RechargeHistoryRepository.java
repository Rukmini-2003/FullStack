package com.example.mobileprepaidservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobileprepaidservice.entity.RechargeHistory;

public interface RechargeHistoryRepository extends JpaRepository<RechargeHistory, Long> {
	   List<RechargeHistory> findByUserId(Long userId);

}
