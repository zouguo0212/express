package edu.zut.cs.express.User_order.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.express.User_order.domain.User_order;
import edu.zut.cs.express.User_order.service.User_orderManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

public class User_ordercontroller {
	@Controller
	@RequestMapping("/User_order")
	public class StudentController extends GenericController<User_order, Long, User_orderManager> {

		User_orderManager user_orderManager;


		@Autowired
		public void setStudentManager(User_orderManager user_orderManager) {
			this.user_orderManager = user_orderManager;
			this.manager = this.user_orderManager;
		}

	}
}