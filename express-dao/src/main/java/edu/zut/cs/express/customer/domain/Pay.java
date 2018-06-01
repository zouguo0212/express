package edu.zut.cs.express.customer.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;
import edu.zut.cs.express.manager.domain.Manger;

@Table(name = "T_ADMIN_Pay")
@Entity
public class Pay extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;


	@Column(name = "manger")
	Manger manger;


	public Manger getManger() {
		return manger;
	}

	public void setManger(Manger manger) {
		this.manger = manger;
	}

}

