package com.rk.mit.OTS.controller;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.mit.OTS.model.LoginUser;
import com.rk.mit.OTS.model.User;
import com.rk.mit.OTS.model.UserPojo;
import com.rk.mit.OTS.services.UserService;

@RestController
@RequestMapping("/rest-api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping()
	public List<User> getAllUser() {
		List<User> users = userService.getAllUser();
		return users;
	}
	
	@PostMapping()
	public User addUser(@RequestBody UserPojo userPojo) {
		User addedUser = userService.addUser(userPojo);
	   return addedUser;
	}

	@PostMapping("/login")
	public User logIn(@RequestBody LoginUser loginModel) {
		User loggedInUser = userService.logIn(loginModel);
		return loggedInUser;
	}
	
	@PostMapping("/update")
	public User updateUser(@RequestBody UserPojo userPojo) {
		  User addedUser = userService.updateUser(userPojo);
		  return addedUser;
	}

}
