package edu.zut.cs.express.Userorder.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;

@Table(name = "T_USER_ORDER")
@Entity
public class Userorder extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 76317481406225775L;

	@Column
	String name;
	
	@Column
	String email;
	
	@Column
	String time;
	
	@Column
	String kind;

	@Column
	String express_num;
	

	public String getUsername() {
		return name;
	}

	public void setUsername(String username) {
		this.name = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getExpress_num() {
		return express_num;
	}

	public void setExpress_number(String express_num) {
		this.express_num = express_num;
	}

}
