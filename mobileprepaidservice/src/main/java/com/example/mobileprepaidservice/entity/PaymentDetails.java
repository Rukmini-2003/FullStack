package com.example.mobileprepaidservice.entity;

import lombok.Data;

@Data
public class PaymentDetails {

	private String method;
	private String upiid;
	private String cardNumber;
	private String bankAccount;
}

