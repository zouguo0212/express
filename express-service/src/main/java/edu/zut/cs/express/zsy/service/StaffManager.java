package edu.zut.cs.express.zsy.service;

import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.zsy.domain.Staff;

public interface StaffManager extends GenericManager<Staff, Long> {

	List<Staff> findByIDnum(String idnum);

	List<Staff> findByName(String name);
}
