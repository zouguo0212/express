package edu.zut.cs.express.login.web.spring.controller;

import edu.zut.cs.express.login.domain.Login;
import edu.zut.cs.express.login.service.LoginManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*import org.springframework.web.bind.annotation.RequestMethod;
*/
@Controller
@RequestMapping("/login/login")
public class LoginController extends GenericController<Login, Long, LoginManager> {

   LoginManager loginManager;
   @RequestMapping(method = RequestMethod.GET,value = "/index.html")
   public String index(){
       String result = "/login/index";
       return result;
   }

    @Autowired
    public void setLoginManager(LoginManager loginManager) {
        this.loginManager = loginManager;
        this.manager = this.loginManager;
    }
}