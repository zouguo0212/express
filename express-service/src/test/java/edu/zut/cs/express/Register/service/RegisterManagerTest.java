package edu.zut.cs.express.Register.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.Register.domain.Register;
import edu.zut.cs.express.Register.service.RegisterManager;

public class RegisterManagerTest extends GenericManagerTestCase<Long, Register, RegisterManager> {

	RegisterManager RegisterManager;

	@Autowired
	public void setStudentManager(RegisterManager RegisterManager) {
		this.RegisterManager = RegisterManager;
		this.manager = this.RegisterManager;
	}

	public RegisterManagerTest() {
		super(Register.class);
	}

	@Before
	public void setUp() throws Exception {
		Register Register = new Register();
		Register.setIdnum("4");
		Register.setUsername("张三");
	//	staff.setAge(21);
		Register.setSex("male");
		this.entity = this.manager.save(Register);
	}

	@Test
	public void testFindByUsername() {
		List<Register> result = this.RegisterManager.findByUsername("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		//assertEquals("张三", result.get(0).getName());
		System.out.println(result.toString());
	}

	@Test
	public void testFindByIdnum() {
		String idnum = this.entity.getIdnum();
		List<Register> result = this.RegisterManager.findByIdnum("idnum");
		//System.out.println(result.toString());
		//assertEquals(idnum, result.get(0).getIDnum());
	}

}
