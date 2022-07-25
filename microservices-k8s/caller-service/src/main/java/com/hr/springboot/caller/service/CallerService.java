package com.hr.springboot.caller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallerService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String getToken() {
		/*
		 * 'callee-service-svc' --> The name of the service object mentioned in the k8s YAML file, not the service name mentioned in the application.properties
		 */
		String response = restTemplate.getForEntity("http://callee-service-svc:8080/msg", String.class).getBody();
		return "Response >> " + response;
	}
	

}
