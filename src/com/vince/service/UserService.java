package com.vince.service;

import com.vince.model.UserModel;

public interface UserService {
	public void register(UserModel user);// 员工注册

	public boolean logIn(UserModel user);// 员工登录

	public boolean Verification(UserModel user);// 登录校验

}
