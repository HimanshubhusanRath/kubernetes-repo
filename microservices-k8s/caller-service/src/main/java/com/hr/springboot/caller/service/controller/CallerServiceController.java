package com.hr.springboot.caller.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.springboot.caller.service.CallerService;

@RestController
public class CallerServiceController {

	private final Logger LOG = LoggerFactory.getLogger(CallerServiceController.class);
	
	@Autowired
	private CallerService service;
	
	@GetMapping("/greet")
	public String getGreeting()
	{
		LOG.debug(" >>>>>>>>>>>> Calling the service to get message <<<<<<<<<<<<<<<<");
		String message = "Hello User. Your message : ";
		message += service.getToken();
		return message;
	}
}
