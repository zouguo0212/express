package edu.zut.cs.express.User_order.service;

import java.util.List;

import edu.zut.cs.express.User_order.domain.User_order;
import edu.zut.cs.express.base.service.GenericManager;

public interface User_orderManager extends GenericManager<User_order,Long> {
	
	List<User_order> findBytime(String TIME);
	
}
