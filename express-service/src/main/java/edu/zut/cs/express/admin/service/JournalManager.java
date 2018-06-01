package edu.zut.cs.express.admin.service;

import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.manager.domain.Journal;

public interface JournalManager extends GenericManager<Journal, Long> {
	
	List<Journal> findbyID(String userId);
	
}
