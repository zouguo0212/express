package edu.zut.cs.express.module.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.express.module.domain.user;
import edu.zut.cs.express.base.dao.Daoconfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Daoconfig.class)
class UserDaoTest {

	@Autowired
	userdao userDao;

	@Test
	void test() {
		String username = "world";
		user query = new user();
		// List<User> result = this.userDao.findOne(null);

		user expectedUser = new user();
		// expectedUser.setUsername(username);
		// assertEquals(user, expectedUser);
		// assertEquals(user.getUsername(), expectedUser.getUsername());
	}

}
