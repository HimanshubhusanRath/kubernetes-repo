package com.hr.springboot.crud.k8s.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.springboot.crud.k8s.domain.User;
import com.hr.springboot.crud.k8s.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostConstruct
	public void addUsers()
	{
		User user = new User(1, "Himanshu", "puri");
		userService.addUser(user);
		user = new User(2, "Amit", "bbsr");
		userService.addUser(user);
		user = new User(3, "Rahul", "bangalore");
		userService.addUser(user);
	}
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") final Integer userId)
	{
		return userService.getUser(userId);
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
}
