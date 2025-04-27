package com.example.mobileprepaidservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mobileprepaidservice.entity.RechargePlan;
import com.example.mobileprepaidservice.repo.RechargePlanRepository;

@Service
public class RechargePlanService {

	
	@Autowired
	private RechargePlanRepository repository;
	
	
	public List<RechargePlan>getAllPlans(){
		return repository.findAll();
	}
	public List<RechargePlan> getPlanByCategory(String Category){
		return repository.findByCategory(Category);
	}
	public RechargePlan insert(RechargePlan rechargeplan) {
		//Todo Auto-generated
		return repository.save(rechargeplan);
		
	}
}