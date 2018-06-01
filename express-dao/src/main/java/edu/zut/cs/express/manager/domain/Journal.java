package edu.zut.cs.express.manager.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;

@Table(name = "T_Journal")
@Entity
public class Journal extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;
	@Column
	/**日志id*/
    String logId;
	@Column
    /**用户id*/
    String userId;
	@Column
    /**模块名称*/
    String moduleName;
	@Column
    /**操作*/
    String operate;
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getOperate() {
		return operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}


}
