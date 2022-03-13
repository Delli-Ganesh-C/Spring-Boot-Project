package com.springboot.learning.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.learning.entity.User;
import com.springboot.learning.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Value("${data.api.url}")
	private String dataUrl;
	
	public List<User> addUser() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		User[] users = restTemplate.getForObject(dataUrl, User[].class);
		List<User> allUsers = Arrays.asList(users);
		List<User> user = userRepository.saveAll(allUsers);
		
		return user;
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}
}
