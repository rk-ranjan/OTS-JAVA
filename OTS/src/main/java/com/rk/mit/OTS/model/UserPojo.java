package com.rk.mit.OTS.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

public class UserPojo {

	public ObjectId _id;
	
	public Integer UserId;

	public String UserName;

	public String Email;

	public String Password;

	public String IsAdmin;
	
	public String get_id() {
			return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
			this._id = _id;
	}

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getIsAdmin() {
		return IsAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		IsAdmin = isAdmin;
	}


}
