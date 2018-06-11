package edu.zut.cs.express.Register.web.spring.controller;

import edu.zut.cs.express.Register.domain.Register;
import edu.zut.cs.express.Register.service.RegisterManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RequestMethod;
*/
@Controller
@RequestMapping("/Register")
public class RegisterController extends GenericController<Register, Long, RegisterManager> {

	RegisterManager RegisterManager;

    @Autowired
    public void setRegisterManager(RegisterManager RegisterManager) {
        this.RegisterManager = RegisterManager;
        this.manager = this.RegisterManager;
    }
}