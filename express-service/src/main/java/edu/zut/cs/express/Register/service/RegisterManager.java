package edu.zut.cs.express.Register.service;

import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.Register.domain.Register;

public interface RegisterManager extends GenericManager<Register, Long> {

	List<Register> findByIdnum(String idnum);


	List<Register> findByUsername(String username);
}
