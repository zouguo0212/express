package edu.zut.cs.express.journal.service;

import java.util.List;

import edu.zut.cs.express.journal.daomain.UJournal;
import edu.zut.cs.express.base.service.GenericManager;

public interface UJournalManager extends GenericManager<UJournal,Long>{
	
	List<UJournal> findByusername(String username);
	
	List<UJournal> findByemail(String email);
}
