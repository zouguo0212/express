package edu.zut.cs.express.manager.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.express.manager.domain.Journal;
import edu.zut.cs.express.manager.service.JournalManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/Journal")
public class Journalcontroller extends GenericController<Journal, Long, JournalManager>{
	
	JournalManager journalManager;
	
	@Autowired
	public void setJournalManager(JournalManager journalManager) {
		this.journalManager = journalManager;
		this.manager = this.journalManager;
	}
}