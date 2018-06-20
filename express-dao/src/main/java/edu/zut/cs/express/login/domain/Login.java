package edu.zut.cs.express.login.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;

@Table(name = "T_Login")
@Entity
public class Login extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "USERNAME")//用户名字
	String username;
	
	@Column(name="USERID")//用户ID
	String userid;

	@Column(name="SEX")//性别
	String sex;
	
	@Column(name = "PASSWORD")//密码
	String password;
	
	@Column(name="PASSAGE")//留言信息
	String passage;

	@Column(name = "EMAIL")//邮箱
	String email;
	
    @Column(name="SATISFUCING")//用户满意度
    String satisficing;

    public String getSatisficing() {
		return satisficing;
	}

	public void setSatisficing(String satisficing) {
		this.passage = satisficing;
	}
	
	public String getPassage() {
		return passage;
	}

	public void setPassage(String passage) {
		this.passage = passage;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid=userid;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex=sex;
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

}
