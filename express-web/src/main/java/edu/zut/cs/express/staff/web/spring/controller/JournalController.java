package edu.zut.cs.express.staff.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.express.base.web.spring.controller.GenericController;
import edu.zut.cs.express.manager.domain.Journal;
import edu.zut.cs.express.admin.service.JournalManager;

@Controller
@RequestMapping("/journal")
public class JournalController extends GenericController<Journal, Long, JournalManager> {

	JournalManager journalManager;

    @Autowired
    public void setStudentManager(JournalManager journalManager) {
        this.journalManager = journalManager;
        this.manager = this.journalManager;
    }

}
