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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @describe :
 * @param x
 *            :
 * @return :
 */
@Entity
public class DepartmentModel {
	private CompanyModel dcompany;
	private String ddepartment;
	private int did;
	private String dphone;

	@ManyToOne
	@JoinColumn(name = "companyId")
	public CompanyModel getDcompany() {
		return dcompany;
	}

	public String getDdepartment() {
		return ddepartment;
	}

	@Id
	@GeneratedValue
	public int getDid() {
		return did;
	}

	public String getDphone() {
		return dphone;
	}

	public void setDcompany(CompanyModel dcompany) {
		this.dcompany = dcompany;
	}

	public void setDdepartment(String ddepartment) {
		this.ddepartment = ddepartment;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public void setDphone(String dphone) {
		this.dphone = dphone;
	}
}
