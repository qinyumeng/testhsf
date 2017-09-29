package com.hsf.provider;

import com.hsf.itemcenter.User;
import com.hsf.itemcenter.UserService;

public class UserServiceImpl  implements UserService{

	public User selectById(String id) {
		User user = new User();
		user.setId(id);
		user.setName("name");
		return user;
	}

}
