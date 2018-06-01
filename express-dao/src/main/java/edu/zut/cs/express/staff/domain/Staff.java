package edu.zut.cs.express.staff.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;

@Table(name = "T_Staff")
@Entity
public class Staff extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	String idnum;
	
	@Column
	String name;
	
	@Column
	String sex;
	
	@Column
	int age;

	
	public String getIDnum() {
		return idnum;
	}

	public void setIDnum(String idnum) {
		this.idnum = idnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
