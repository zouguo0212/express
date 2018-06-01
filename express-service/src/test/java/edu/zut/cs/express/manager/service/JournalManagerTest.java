package edu.zut.cs.express.manager.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.manager.domain.Journal;
import edu.zut.cs.express.admin.service.JournalManager;

public class JournalManagerTest extends GenericManagerTestCase<Long, Journal, JournalManager> {

	JournalManager journalManager;

	@Autowired
	public void setJournalManager(JournalManager journalManager) {
		this.journalManager = journalManager;
		this.manager = this.journalManager;
	}

	public JournalManagerTest() {
		super(Journal.class);
	}

	@Before
	public void setUp() throws Exception {
		Journal journal = new Journal();
		journal.setLogId("001");
		journal.setUserId("张三");
		this.entity = this.manager.save(journal);
	}

	@Test
	public void testFindByFullname() {
		List<Journal> result = this.journalManager.FindAll("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getUserId());
	}

	/*@Test
	public void testFindByPostcode() {
		String postcode = this.entity.getCode();
		List<Student> result = this.studentManager.findByCode(postcode);
		assertEquals(postcode, result.get(0).getCode());

	}*/

}

