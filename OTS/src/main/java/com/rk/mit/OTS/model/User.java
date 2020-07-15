package com.rk.mit.OTS.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="user")
public class User {
 
	  @Id
	  public ObjectId _id;
	  
	  public Integer UserId;
	  
	  @Field(name="UserName")
	  public String username;
	  
	  public String Email;
	  
	  @Field(name="Password")
	  public String password;
	  
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
		this.UserId = userId;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsAdmin() {
		return IsAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.IsAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "User [_id=" + _id + ", UserId=" + UserId + ", username=" + username + ", Email=" + Email + ", password="
				+ password + ", IsAdmin=" + IsAdmin + "]";
	}
	  
}
