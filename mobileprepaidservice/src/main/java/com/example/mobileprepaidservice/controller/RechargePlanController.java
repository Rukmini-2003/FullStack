package com.example.mobileprepaidservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobileprepaidservice.entity.RechargePlan;
import com.example.mobileprepaidservice.service.RechargePlanService;

@RestController
@RequestMapping("/plans")
public class RechargePlanController {

	
	private final RechargePlanService service;
	 
    public RechargePlanController(RechargePlanService service) {
        this.service = service;
    }
 
    @GetMapping
    public List<RechargePlan> getAllPlans() {
        return service.getAllPlans();
    }
 
    @GetMapping("/{category}")
    public List<RechargePlan> getByCategory(@PathVariable String category) {
        return service.getPlanByCategory(category);
    }
    
    @PostMapping
    public RechargePlan insert(@RequestBody RechargePlan rechargeplan) {
    	
    	
    	return service.insert(rechargeplan);
    	
    	
    }
}
