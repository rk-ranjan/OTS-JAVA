package com.rk.mit.OTS.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.rk.mit.OTS.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	User findByUsername(String UserName);
	User findByPassword(String Password);
	User findByUsernameAndPassword(String UserName,String Password);
}
