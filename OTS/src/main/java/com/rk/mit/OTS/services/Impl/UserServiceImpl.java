package com.rk.mit.OTS.services.Impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rk.mit.OTS.model.LoginUser;
import com.rk.mit.OTS.model.User;
import com.rk.mit.OTS.model.UserPojo;
import com.rk.mit.OTS.repository.UserRepository;
import com.rk.mit.OTS.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository userRepository;
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@SuppressWarnings("unused")
	@Override
	public User logIn(LoginUser loginModel) {
		User loggedInUser = userRepository.findByUsernameAndPassword(loginModel.getUsername(), loginModel.getPassword());
		User u1 = userRepository.findByUsername(loginModel.getUsername());
		User u2 = userRepository.findByPassword(loginModel.getPassword());
		String str = u1.getUserName();	
		String str2 = u2.getUserName();
		if(str.equals(str2)) {
			System.out.println("Login Success");
			return u2;
		} else {
			User user = new User();
			user.setUserName("Invalid");
			return user; 
		}
		
	}

	@Override
	public User checkUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(UserPojo userPojo) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserName(userPojo.getUserName());
		user.setEmail(userPojo.getEmail());
		user.setIsAdmin(userPojo.getIsAdmin());
		user.setPassword(userPojo.getPassword());
		user.setUserId(userPojo.getUserId());
		userRepository.save(user);
		return user;
	}

	@Override
	public User updateUser(UserPojo userPojo) {
		// TODO Auto-generated method stub
		System.out.println("Updated"+userPojo.getUserName());
		User user = userRepository.findByUsername(userPojo.getUserName());
		user.setEmail(userPojo.getEmail());
		user.setPassword(userPojo.getPassword());
		user.setIsAdmin(userPojo.getIsAdmin());
		System.out.println("Updated"+user.IsAdmin);
		user = userRepository.save(user);
		return user;
	}

}
