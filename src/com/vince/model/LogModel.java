/**
 * @package : com.vince.model
 * @date : 2015年1月20日
 * @author : vince
 * @version : 0.9
 */
package com.vince.model;

import java.util.Date;

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
public class LogModel {
	Date ldatetime;
	int lid;
	String lip;
	int luid;

	public Date getLdatetime() {
		return ldatetime;
	}

	@Id
	@GeneratedValue
	public int getLid() {
		return lid;
	}

	public String getLip() {
		return lip;
	}

	public int getLuid() {
		return luid;
	}

	public void setLdatetime(Date ldatetime) {
		this.ldatetime = ldatetime;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public void setLip(String lip) {
		this.lip = lip;
	}

	public void setLuid(int luid) {
		this.luid = luid;
	}

}
