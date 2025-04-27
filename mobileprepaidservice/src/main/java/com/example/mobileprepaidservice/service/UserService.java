package com.example.mobileprepaidservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mobileprepaidservice.entity.User;
import com.example.mobileprepaidservice.repo.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository userrepository;
	
	public User insert(User user) {
		return userrepository.save(user);
		
	}
	public List<User>  fetchAllUsers(){
		 List<User >users=userrepository.findAll();
	
	   return users;
	}
	
	
	
}
