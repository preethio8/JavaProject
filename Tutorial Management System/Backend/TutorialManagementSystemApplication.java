package com.example.Tutorial_ManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Tutorial_ManagementSystem.Model.TwilioConfig;
import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class TutorialManagementSystemApplication {
	
	@Autowired
	private TwilioConfig twilioConfig;
	
	@PostConstruct
	public void setup() {
		Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
	}

	public static void main(String[] args) 
	{
		SpringApplication.run(TutorialManagementSystemApplication.class, args);
	}
}

