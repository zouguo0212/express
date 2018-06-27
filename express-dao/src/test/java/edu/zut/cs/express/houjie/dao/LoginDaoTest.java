package edu.zut.cs.express.houjie.dao;

//import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.houjie.dao.LoginDao;
import edu.zut.cs.express.houjie.domain.Login;

/**
 * @author houjie
 * @Description:test
 * 
 */
public class LoginDaoTest extends GenericDaoTestCase<Long, Login, LoginDao> {

	@Autowired
	LoginDao LoginDao;

	@Test
	public void test() {
		System.out.println("This is Junit Test!");
	
	}

}