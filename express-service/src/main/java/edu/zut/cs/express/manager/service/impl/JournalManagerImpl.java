package edu.zut.cs.express.manager.service.impl;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.manager.dao.JournalDao;
import edu.zut.cs.express.manager.domain.Journal;
import edu.zut.cs.express.manager.service.JournalManager;
import edu.zut.cs.express.base.service.impl.GenericManagerImpl;

/**
 * @author UML
 *
 */
@Component
public class JournalManagerImpl extends GenericManagerImpl<Journal,Long> implements JournalManager{

	JournalDao journalDao;
	
	@Autowired
	public void setDinanceDao(JournalDao journalDao) {
		this.journalDao = journalDao;
		this.dao = this.journalDao;
	}
	
	@Override
	public List<Journal> findbyID(String logId) {
		// 创建查询条件数据对象
		Journal queryObjuet = new Journal();
		queryObjuet.setLogId(logId);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() //构件对象
				.withMatcher("logId", GenericPropertyMatchers.startsWith())
				.withIgnorePaths("dateCreated", "dateModified");
		//创建实例并查询
		Example<Journal> example = Example.of(queryObjuet,matcher);
		List<Journal> result = dao.findAll(example);
		return result;
	}

	@Override
	public List<Journal> findbyName(String userId) {
		
		//创建查询条件数据对象
		Journal queryObject = new Journal();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setUserId(userId);
		//创建适配器
		ExampleMatcher matcher = ExampleMatcher.matching() //构件对象
				.withStringMatcher(StringMatcher.CONTAINING)
				.withIgnoreCase(true)//忽略大小写
				.withMatcher("userName", GenericPropertyMatchers.startsWith());
		//创建实例并查询
		Example<Journal> example = Example.of(queryObject,matcher);
		List<Journal> result = dao.findAll(example);
		return result;
	}

	
}
