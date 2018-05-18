package edu.zut.cs.express.admin.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;
import edu.zut.cs.express.admin.domain.Group;

@Table(name = "T_ADMIN_USER")
@Entity
public class user_register extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "USERNAME")
	String username;

	@Column(name = "PASSWORD")
	String password;

	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "SEX")
	String sex;
	
	@Column(name = "PHONE")
	String phone;
	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}