package edu.zut.cs.express.login.dao;

//import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.login.dao.LoginDao;
import edu.zut.cs.express.login.domain.Login;

public class LoginDaoTest extends GenericDaoTestCase<Long, Login, LoginDao> {

	@Autowired
	LoginDao LoginDao;

	@Test
	public void test() {
		System.out.println("This is Junit Test!");
	
	}

}