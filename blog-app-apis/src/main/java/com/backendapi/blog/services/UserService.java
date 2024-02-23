package com.backendapi.blog.services;

import java.util.List;

import com.backendapi.blog.entities.User;
import com.backendapi.blog.payloads.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);
	UserDto uodateUser(UserDto user,Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
