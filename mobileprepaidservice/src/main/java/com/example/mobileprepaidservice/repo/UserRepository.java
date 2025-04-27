 package com.example.mobileprepaidservice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobileprepaidservice.entity.User;

public interface UserRepository  extends JpaRepository<User,Long>{
 
	
	Optional<User> findByMobile(String mobile);
	Optional<User> findByEmail(String email); 
}
