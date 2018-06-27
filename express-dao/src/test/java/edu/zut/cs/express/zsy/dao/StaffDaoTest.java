package edu.zut.cs.express.zsy.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.zsy.dao.StaffDao;
import edu.zut.cs.express.zsy.domain.Staff;

/**
 * @author:zsy0216
 * @Description:entity Junittest
 */
public class StaffDaoTest extends GenericDaoTestCase<Long, Staff, StaffDao> {

	@Autowired
	StaffDao staffDao;

	@Test
	public void test() {
		System.out.println("This is JunitTest!");
	}

}
