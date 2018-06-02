package edu.zut.cs.express.User_order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.User_order.dao.User_orderDao;
import edu.zut.cs.express.User_order.domain.User_order;
import edu.zut.cs.express.User_order.service.User_orderManager;
import edu.zut.cs.express.base.service.impl.GenericManagerImpl;



@Component
public class User_orderManagerImpl extends GenericManagerImpl<User_order,Long> implements User_orderManager{

    User_orderDao user_orderDao;
	
	@Autowired
	public void setDinanceDao(User_orderDao user_orderDao) {
		this.user_orderDao = user_orderDao;
		this.dao = this.user_orderDao;
	}
	
	@Override
	public List<User_order> findBytime(String TIME) {
		// 创建查询条件数据对象
		User_order queryObjuet = new User_order();
		queryObjuet.setTime(TIME);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() //构件对象
				.withMatcher("idnum", GenericPropertyMatchers.startsWith())
				.withIgnorePaths("dateCreated", "dateModified");
		//创建实例并查询
		Example<User_order> example = Example.of(queryObjuet,matcher);
		List<User_order> result = dao.findAll(example);
		return result;
	}


}