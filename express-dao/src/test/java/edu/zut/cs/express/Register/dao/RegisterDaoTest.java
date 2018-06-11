package edu.zut.cs.express.Register.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.Register.dao.RegisterDao;
import edu.zut.cs.express.Register.domain.Register;

public class RegisterDaoTest extends GenericDaoTestCase<Long, Register, RegisterDao> {

	@Autowired
	RegisterDao RegisterDao;

	@Test
	public void testFindAll() {

		List<Register> result = this.RegisterDao.findAll();

	}

}