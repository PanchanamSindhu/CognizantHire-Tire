package com.digitalbook.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbook.entity.ERole;
import com.digitalbook.entity.Role;
import com.digitalbook.entity.User;
import com.digitalbook.repository.RoleRepository;
import com.digitalbook.repository.UserRepository;
import com.digitalbook.service.UserService;
import java.util.Optional;

/**
 * 
 * @author sindhu
 * This is UserServiceImpl which is used for running methods from controller
 * getUser method is used for fetching user with user id and role
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;


	@Override
	public User getUser(int userId, ERole roleUser) {
		
		return null;
	}



}
