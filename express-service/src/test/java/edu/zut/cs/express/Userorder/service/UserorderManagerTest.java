package edu.zut.cs.express.Userorder.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Userorder.domain.Userorder;
import edu.zut.cs.express.base.service.GenericManagerTestCase;

public class UserorderManagerTest extends GenericManagerTestCase<Long, Userorder, UserorderManager>{

	UserorderManager userorderManager;
	
	@Autowired
	public void setUserorderTestManager(UserorderManager userorderManager) {
		this.userorderManager = userorderManager;
		this.manager = this.userorderManager;
	}
	
	
	public UserorderManagerTest() {
		super(Userorder.class);
		
	}
	
	@Test
	public void testFindByname() {
		System.out.println("This is Junit Test");
	}

}
