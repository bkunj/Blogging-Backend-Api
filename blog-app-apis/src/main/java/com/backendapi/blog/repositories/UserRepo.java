package com.backendapi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendapi.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>  {

	 
}
