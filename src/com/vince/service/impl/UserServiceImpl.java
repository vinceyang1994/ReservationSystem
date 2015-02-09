package com.vince.service.impl;

import com.vince.dao.UserDao;
import com.vince.dao.impl.UserDaoImpl;
import com.vince.model.UserModel;
import com.vince.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void register(UserModel user) {
		this.userDao.addUser(user);
	}

	@Override
	public boolean logIn(UserModel user) {

		return this.userDao.Verification(user);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vince.service.UserService#Verification(com.vince.model.UserModel)
	 */
	@Override
	public boolean Verification(UserModel user) {
		// TODO Auto-generated method stub
		return false;
	}

}
