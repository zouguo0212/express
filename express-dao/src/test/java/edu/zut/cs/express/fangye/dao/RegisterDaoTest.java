package edu.zut.cs.express.fangye.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.fangye.domain.Register;

public class RegisterDaoTest extends GenericDaoTestCase<Long, Register, RegisterDao> {

	@Autowired
	RegisterDao registerDao;

	@Test
	public void testFindAll() {

		List<Register> result = this.registerDao.findAll();

	}

}