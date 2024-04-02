package com.dinhle.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dinhle.ecommerce.model.User;
import com.dinhle.ecommerce.repository.UserRepository;

@Service
public interface UserService {
	List<User> findAllUser();
	
	User findUserById(int user_id);
	
	User createUser(User user);
	
	User updateUser(int user_id, User user);
	
	User loginUser(String username, String password);
}
