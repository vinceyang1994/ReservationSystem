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
public class PermissionModel {
	int pid;
	int ppermission;

	@Id
	@GeneratedValue
	public int getPid() {
		return pid;
	}

	public int getPpermission() {
		return ppermission;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPpermission(int ppermission) {
		this.ppermission = ppermission;
	}
}
