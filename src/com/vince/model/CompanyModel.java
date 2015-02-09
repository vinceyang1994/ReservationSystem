/**
 * @package : com.vince.model
 * @date : 2015年1月20日
 * @author : vince
 * @version : 0.9
 */
package com.vince.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @describe :
 * @param x
 *            :
 * @return :
 */
@Entity
public class CompanyModel {
	private String cfax;
	private int cid;
	private String clocation;
	private String cname;
	private String cphone;
	private Set<DepartmentModel> departments = new HashSet<DepartmentModel>();

	public String getCfax() {
		return cfax;
	}

	@Id
	@GeneratedValue
	public int getCid() {
		return cid;
	}

	public String getClocation() {
		return clocation;
	}

	public String getCname() {
		return cname;
	}

	public String getCphone() {
		return cphone;
	}

	@OneToMany(mappedBy = "dcompany")
	public Set<DepartmentModel> getDepartments() {
		return departments;
	}

	public void setCfax(String cfax) {
		this.cfax = cfax;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setClocation(String clocation) {
		this.clocation = clocation;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public void setDepartments(Set<DepartmentModel> departments) {
		this.departments = departments;
	}
}
