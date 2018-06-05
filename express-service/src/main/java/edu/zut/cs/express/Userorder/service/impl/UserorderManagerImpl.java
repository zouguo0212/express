package edu.zut.cs.express.Userorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.Userorder.dao.UserorderDao;
import edu.zut.cs.express.Userorder.domain.Userorder;
import edu.zut.cs.express.Userorder.service.UserorderManager;
import edu.zut.cs.express.base.service.impl.GenericManagerImpl;

@Component
public class UserorderManagerImpl extends GenericManagerImpl<Userorder, Long> implements UserorderManager{

	UserorderDao userorderDao;
	
	@Autowired
	public void setUserorderDao(UserorderDao userorderDao) {
		this.userorderDao = userorderDao;
		this.dao = this.userorderDao;
	}
	
	@Override
	public List<Userorder> findByKind(String kind) {
		// 创建查询条件数据对象
		Userorder queryObjuet = new Userorder();
		queryObjuet.setKind(kind);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching()//构件对象
		      .withMatcher("kind", GenericPropertyMatchers.startsWith())
		      .withIgnorePaths("dateCreated","dateModified");
		
		Example<Userorder> example = Example.of(queryObjuet, matcher);
		List<Userorder> result = dao.findAll(example);
		
		return result;
	}

	@Override
	public List<Userorder> findByName(String name) {
		
		Userorder queryObject = new Userorder();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setUsername(name);
		
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withStringMatcher(StringMatcher.CONTAINING)
				.withIgnoreCase(true)
				.withMatcher("name", GenericPropertyMatchers.startsWith());
		Example<Userorder> example = Example.of(queryObject, matcher);
		List<Userorder> result = dao.findAll(example);
		
		return result;
	}

}
