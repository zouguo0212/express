package edu.zut.cs.express.Userorder.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Ymz.domain.MyUserorder;
import edu.zut.cs.express.Ymz.service.MyUserorderManager;
import edu.zut.cs.express.base.service.GenericManagerTestCase;

/**
 * @author 杨曼珍
 *测试
 */
public class MyUserorderManagerTest extends GenericManagerTestCase<Long, MyUserorder, MyUserorderManager>{

	MyUserorderManager myUserorderManager;
	
	@Autowired
	public void setUserorderTestManager(MyUserorderManager myUserorderManager) {
		this.myUserorderManager = myUserorderManager;
		this.manager = this.myUserorderManager;
	}
	
	
	public MyUserorderManagerTest() {
		super(MyUserorder.class);
		
	}
	
	@Test
	public void testFindByname() {
		System.out.println("This is Junit Test");
	}

}
