package edu.zut.cs.express.staff.dao;

//import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.staff.dao.StaffDao;
import edu.zut.cs.express.staff.domain.Staff;

public class StaffDaoTest extends GenericDaoTestCase<Long, Staff, StaffDao> {

	@Autowired
	StaffDao staffDao;

	/*@Test
	public void testFindAll() {

		List<Staff> result = this.staffDao.findAll();*/
	@Test
	public void test() {
		System.out.println("This is JunitTest!");
	}
	

	}


