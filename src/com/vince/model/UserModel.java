/**
 * @package : com.vince.model
 * @date : 2015年1月14日
 * @author : vince
 * @version : 0.9
 */
package com.vince.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @describe :
 * @param x
 *            :
 * @return :
 */
@Entity
public class UserModel {
	int uemployeeId;
	int uid;
	String upassword;
	int upermission;
	UserInfoModel userinfo;

	public int getUemployeeId() {
		return uemployeeId;
	}

	@Id
	//@GeneratedValue
	public int getUid() {
		return uid;
	}

	public String getUpassword() {
		return upassword;
	}

	public int getUpermission() {
		return upermission;
	}
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public UserInfoModel getUserinfo() {
		return userinfo;
	}

	public void setUemployeeId(int uemployeeId) {
		this.uemployeeId = uemployeeId;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public void setUpermission(int upermission) {
		this.upermission = upermission;
	}

	public void setUserinfo(UserInfoModel userinfo) {
		this.userinfo = userinfo;
	}

}
