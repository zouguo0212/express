package edu.zut.cs.express.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.admin.domain.user_register;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class user_registerDaoTest extends GenericDaoTestCase<Long, user_register, user_registerDao> {

	@Autowired
	user_registerDao user_registerDao;

	@Test
	public void testFindAll() {

		List<user_register> result = this.user_registerDao.findAll();

	}

}

