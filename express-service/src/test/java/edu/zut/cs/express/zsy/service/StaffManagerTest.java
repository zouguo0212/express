package edu.zut.cs.express.zsy.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.zsy.domain.Staff;
import edu.zut.cs.express.zsy.service.StaffManager;

/**
 * @author:zsy0216
 * @Description:StaffManagerTest class define
 */

public class StaffManagerTest extends GenericManagerTestCase<Long, Staff, StaffManager> {

	StaffManager staffManager;

	public StaffManagerTest() {
		super(Staff.class);
	}

	@Autowired
	public void setStudentManager(StaffManager staffManager) {
		this.staffManager = staffManager;
		this.manager = this.staffManager;
	}

	@Before
	public void setUp() throws Exception {
		Staff staff = new Staff();
		staff.setIDnum("4");
		staff.setName("张三");
		staff.setAge(21);
		staff.setSex("male");
		this.entity = this.manager.save(staff);
	}

	/**
	 * test method
	 */
	@Test
	public void testFindByName() {
		List<Staff> result = this.staffManager.findByName("张");
		assertNotNull(result);
		System.out.println(result.toString());
	}

	@Test
	public void testFindByidnum() {
		String idnum = this.entity.getIDnum();
		List<Staff> result = this.staffManager.findByIDnum(idnum);
		System.out.println(result.toString());
	}
}
