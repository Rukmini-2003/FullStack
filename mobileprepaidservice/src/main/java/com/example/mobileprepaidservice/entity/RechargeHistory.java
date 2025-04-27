package com.example.mobileprepaidservice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//it will give all the setters and getters
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class RechargeHistory {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	  
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private RechargePlan plan;
	
	private String paymentMethod;
	private LocalDateTime rechargeDate;
}