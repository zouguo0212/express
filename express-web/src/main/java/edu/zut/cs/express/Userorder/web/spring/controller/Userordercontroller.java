package edu.zut.cs.express.Userorder.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.express.Userorder.domain.Userorder;
import edu.zut.cs.express.Userorder.service.UserorderManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/Userorder")
public class Userordercontroller extends GenericController<Userorder, Long, UserorderManager>{
	
	UserorderManager userorderManager;
	
	@Autowired
	public void setUserorderManager(UserorderManager userorderManager) {
		
		this.userorderManager = userorderManager;
		this.manager = this.userorderManager;
	}
	
}
