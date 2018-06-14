package edu.zut.cs.express.fangye.web.spring.controller;

import edu.zut.cs.express.fangye.domain.Register;
import edu.zut.cs.express.fangye.service.RegisterManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/fangye/register")
public class RegisterController extends GenericController<Register, Long, RegisterManager> {

	RegisterManager registerManager;

    @RequestMapping(method = RequestMethod.GET,value = "/index.html")
    public String index(){
        String result = "/register/index";
        return result;
    }


    @Autowired
    public void setRegisterManager(RegisterManager registerManager) {
        this.registerManager = registerManager;
        this.manager = this.registerManager;
    }
}