package edu.zut.cs.express.Userorder.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Userorder.domain.Userorder;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class UserorderDaoTest extends GenericDaoTestCase<Long, Userorder, UserorderDao>{
	
	@Autowired
	UserorderDao userorderDao;
	
	@Test
	public void test() {
		System.out.println("This is Junit Test!");
	}

}
