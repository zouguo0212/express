package edu.zut.cs.express.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseTreeEntity;

@Table(name = "T_ADMIN_Pay")
@Entity
@NamedQueries({ @NamedQuery(name = "Group.getRoot", query = "select g from Group g where g.parent is null") })
public class Pay extends BaseTreeEntity<Pay> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1751952224371998469L;

	@Column(name = "user")
	user user;
	public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
	public Manger getManger() {
		return manger;
	}
	public void setManger(Manger manger) {
		this.manger = manger;
	}
	@Column(name = "user")
    Manger manger;
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;

}
