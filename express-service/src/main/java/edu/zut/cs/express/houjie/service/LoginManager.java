package edu.zut.cs.express.houjie.service;

import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.houjie.domain.Login;

/**
 * @author houjie
 * @Description:Define interface
 * 
 */
public interface LoginManager extends GenericManager<Login, Long> {

	List<Login> findByUserid(String userid);


	List<Login> findByUsername(String username);
}

