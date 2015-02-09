/**
 * @package : com.vince.model
 * @date : 2015年1月20日
 * @author : vince
 * @version : 0.9
 */
package com.vince.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @describe :
 * @param x
 *            :
 * @return :
 */
@Entity
public class TableModel {
	UserModel tadmin;// 实验台管理员
	int tid;
	String ttablename;// 实验台名称

	public UserModel getTadmin() {
		return tadmin;
	}

	@Id
	@GeneratedValue
	public int getTid() {
		return tid;
	}

	public String getTtablename() {
		return ttablename;
	}

	public void setTadmin(UserModel tadmin) {
		this.tadmin = tadmin;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public void setTtablename(String ttablename) {
		this.ttablename = ttablename;
	}

}
