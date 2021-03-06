package com.example.sample_maven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample_maven.request.UserResponse;

@RestController
public class User {

	@GetMapping("/getuser")
	public UserResponse getUser() {
		UserResponse response=new UserResponse();
		response.setId(101L);
		response.setUserName("Hari Gupta");
		response.setEmailId("guptah@gmail.com");
		return response;
	}
}
