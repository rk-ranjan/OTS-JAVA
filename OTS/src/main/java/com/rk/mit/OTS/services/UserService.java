package com.rk.mit.OTS.services;

import java.util.List;

import com.rk.mit.OTS.model.LoginUser;
import com.rk.mit.OTS.model.User;
import com.rk.mit.OTS.model.UserPojo;

public interface UserService {

	public List<User> getAllUser();
	
	public User checkUser(User user);

	public User logIn(LoginUser loginModel);

	public User addUser(UserPojo userPojo);

	public User updateUser(UserPojo userPojo);
}
