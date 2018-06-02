package edu.zut.cs.express.User_order.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.User_order.domain.User_order;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class User_orderDaoTest extends GenericDaoTestCase<Long, User_order, User_orderDao> {

	@Autowired
	User_orderDao user_orderDao;

	@Test
	public void testFindAll() {

		List<User_order> result = this.user_orderDao.findAll();

	}

}
