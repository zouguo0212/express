package edu.zut.cs.express.Userorder.service;


import java.util.List;

import edu.zut.cs.express.Userorder.domain.Userorder;
import edu.zut.cs.express.base.service.GenericManager;

public interface UserorderManager extends GenericManager<Userorder, Long> {

	List<Userorder> findByKind(String kind);

	List<Userorder> findByName(String name);
}