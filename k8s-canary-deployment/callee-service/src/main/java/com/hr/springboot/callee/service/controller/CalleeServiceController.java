package com.hr.springboot.callee.service.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalleeServiceController {

	private final Random random = new Random(1000);
	private final Logger LOG = LoggerFactory.getLogger(CalleeServiceController.class);
	
	@GetMapping("/msg")
	public String getGreeting() throws UnknownHostException
	{
		LOG.debug(" ######## Generating a token ########");
		return "From : "+InetAddress.getLocalHost().getHostName()+""+random.nextInt();
	}
}
