package edu.zut.cs.express.fangye.service;

import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.fangye.domain.Register;

public interface RegisterManager extends GenericManager<Register, Long> {

	List<Register> findByIdnum(String idnum);


	List<Register> findByUsername(String username);
}
