package edu.zut.cs.express.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.admin.domain.User_use;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class User_usedaoTest extends GenericDaoTestCase<Long, User_use, User_usedao> {

	@Autowired
	User_usedao User_usedao;

	@Test
	public void testFindAll() {

		List<User_use> result = this.User_usedao.findAll();

	}

}