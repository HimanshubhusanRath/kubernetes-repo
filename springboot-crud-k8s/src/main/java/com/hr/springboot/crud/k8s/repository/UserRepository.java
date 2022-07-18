package com.hr.springboot.crud.k8s.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hr.springboot.crud.k8s.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
