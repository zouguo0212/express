package edu.zut.cs.express.manager.service;

import java.util.List;

import edu.zut.cs.express.manager.domain.Journal;
import edu.zut.cs.express.base.service.GenericManager;

public interface JournalManager extends GenericManager<Journal,Long>{
	
	List<Journal> findbyID(String logId);
	
	List<Journal> findbyName(String userId);
}

