package edu.zut.cs.express.manager.service;

import java.util.List;

import edu.zut.cs.express.manager.domain.Journal;
import edu.zut.cs.express.base.service.GenericManager;

/**
 * @author UML
 *
 */
public interface JournalManager extends GenericManager<Journal,Long>{
	
	/**
	 * get journal list by given logId
	 *
	 * @param logId
	 * @return
	 */
	List<Journal> findbyID(String logId);
	
	/**
	 * 
	 * @param Name
	 * @return
	 */
	List<Journal> findbyName(String userId);
}

