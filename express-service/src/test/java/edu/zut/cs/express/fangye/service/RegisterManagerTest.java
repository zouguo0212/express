package edu.zut.cs.express.fangye.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.fangye.domain.Register;

public class RegisterManagerTest extends GenericManagerTestCase<Long, Register, RegisterManager> {

	RegisterManager registerManager;

	@Autowired
	public void setStudentManager(RegisterManager registerManager) {
		this.registerManager = registerManager;
		this.manager = this.registerManager;
	}

	public RegisterManagerTest() {
		super(Register.class);
	}

	@Before
	public void setUp() throws Exception {
		Register register = new Register();
		register.setIdnum("4");
		register.setUsername("张三");
	//	staff.setAge(21);
		register.setSex("male");
		this.entity = this.manager.save(register);
	}

	@Test
	public void testFindByUsername() {
		List<Register> result = this.registerManager.findByUsername("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		//assertEquals("张三", result.get(0).getName());
		System.out.println(result.toString());
	}

	@Test
	public void testFindByIdnum() {
		String idnum = this.entity.getIdnum();
		List<Register> result = this.registerManager.findByIdnum("idnum");
		//System.out.println(result.toString());
		//assertEquals(idnum, result.get(0).getIDnum());
	}

}
