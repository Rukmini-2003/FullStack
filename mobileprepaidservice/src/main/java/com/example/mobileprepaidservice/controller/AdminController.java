package com.example.mobileprepaidservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobileprepaidservice.entity.User;
import com.example.mobileprepaidservice.service.AdminService;

@RestController
public class AdminController {
 
	
	@Autowired
	AdminService adminservice;
	
	
	@GetMapping("/admin/usersexpiring")
	public List<User> getAllUsersExpiring(){
		
		
		return adminservice.getAllUsersExpiring();
	}
	
	
}