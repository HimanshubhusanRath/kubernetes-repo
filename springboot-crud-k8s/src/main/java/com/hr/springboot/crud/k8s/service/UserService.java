package com.hr.springboot.crud.k8s.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.springboot.crud.k8s.domain.User;
import com.hr.springboot.crud.k8s.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public User addUser(final User user)
	{
		return userRepo.save(user);
	}
	
	public User getUser(final Integer id)
	{
		return userRepo.findById(id).get();
	}
	
	public List<User> getAllUsers()
	{
		return userRepo.findAll();
	}
}
