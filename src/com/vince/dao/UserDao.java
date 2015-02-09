package com.vince.dao;

import com.vince.model.UserModel;

public interface UserDao {
	public void addUser(UserModel user);

	public boolean Verification(UserModel user);

}
