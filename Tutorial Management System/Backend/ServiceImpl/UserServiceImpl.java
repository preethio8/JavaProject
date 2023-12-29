package com.example.Tutorial_ManagementSystem.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tutorial_ManagementSystem.Model.User;
import com.example.Tutorial_ManagementSystem.Repository.UserRepository;



@Service
public class UserServiceImpl {
	@Autowired
	private UserRepository userRepository;
	

	public void addUser(User user) {
		
		this.userRepository.save(user);  
		
	}


public Optional<User> getUserByEmail(String email) {
		
		return this.userRepository.findByuserEmail(email);		
		
	}

}
