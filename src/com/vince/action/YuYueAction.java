/**
 * 
 */
package com.vince.action;

import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionContext;
import com.vince.model.UserModel;
import com.vince.service.UserService;
import com.vince.service.impl.UserServiceImpl;


/**
 * @author vince
 * 
 */
@Result(name="SUCCESS",location="reservation.jsp")
public class YuYueAction{
	private String code;//用户提交的验证码
	private UserModel user = new UserModel();
	UserService us = new UserServiceImpl();

	/*请求用户注册ip，只能是公司内部ip*/
	/*HttpServletRequest request=ServletActionContext.getRequest();*/
	
	
	public String execute() {
		String sessionCode = (String) (ActionContext.getContext().getSession()
				.get("random"));//从session中拿到随机验证码
		if (sessionCode.equals(this.getCode())) {
			
			
			this.us.register(user);
			return "SUCCESS";
		}
		else
			return "codeWrong";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


}
