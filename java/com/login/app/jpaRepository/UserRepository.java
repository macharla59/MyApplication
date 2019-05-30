package com.login.app.jpaRepository;

import org.springframework.data.repository.CrudRepository;

import com.login.app.entity.User;

public interface UserRepository extends CrudRepository <User, Long> {

	User findByUsernameAndPassword(String username, String password);
	

}
