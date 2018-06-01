package edu.zut.cs.express.staff.service;

import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.staff.domain.Staff;

public interface StaffManager extends GenericManager<Staff, Long> {

	List<Staff> findByIDnum(String idnum);


	List<Staff> findByName(String name);
}
