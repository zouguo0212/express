package edu.zut.cs.express.houjie.service;

import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.houjie.domain.Login;
import edu.zut.cs.express.houjie.service.LoginManager;
/**
 * @author houjie
 *
 * @Description:Define LoginManagerTest extends GenericManagerTestCase
 */

public class LoginManagerTest extends GenericManagerTestCase<Long, Login, LoginManager> {


	LoginManager loginManager;

	@Autowired
	public void setStudentManager(LoginManager loginManager) {
		this.loginManager = loginManager;
		this.manager = this.loginManager;
	}

	public LoginManagerTest() {
		super(Login.class);
	}

	@Before
	public void setUp() throws Exception {
		Login login = new Login();
		login.setUserid("4");
		login.setUsername("张三");
		login.setPassword("123456");
		login.setSex("男");
		this.entity = this.manager.save(login);
	}

	@Test
	public void testFindByUsername() {
		List<Login> result = this.loginManager.findByUsername("张");
		assertNotNull(result);
		System.out.println(result.toString());
	}
}
