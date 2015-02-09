/**
 * @package : com.vince.model
 * @date : 2015年1月14日
 * @author : vince
 * @version : 0.9
 */
package com.vince.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @describe :
 * @param x
 *            :
 * @return :
 */
public class UserInfoModel {
	int creditworthiness;
	DepartmentModel department;
	String email;
	int id;
	String Name;
	String phone;
	String position;
	String telephone;

	UserModel user;

	public int getCreditworthiness() {
		return creditworthiness;
	}

	public DepartmentModel getDepartment() {
		return department;
	}

	public String getEmail() {
		return email;
	}

	@Id
	@GenericGenerator(name = "pkGenerator", strategy = "foreign", parameters = { @Parameter(name = "property", value = "user") })
	@GeneratedValue(generator = "pkGenerator")
	public int getId() {
		return id;
	}

	public String getName() {
		return Name;
	}

	public String getPhone() {
		return phone;
	}

	public String getPosition() {
		return position;
	}

	public String getTelephone() {
		return telephone;
	}

	@OneToOne(mappedBy = "userinfo")
	public UserModel getUser() {
		return user;
	}

	public void setCreditworthiness(int creditworthiness) {
		this.creditworthiness = creditworthiness;
	}

	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

}
