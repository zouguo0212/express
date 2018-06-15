package edu.zut.cs.express.journal.service.impl;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.journal.dao.UJournalDao;
import edu.zut.cs.express.journal.daomain.UJournal;
import edu.zut.cs.express.journal.service.UJournalManager;
import edu.zut.cs.express.base.service.impl.GenericManagerImpl;

@Component
public class UJournalManagerImpl extends GenericManagerImpl<UJournal,Long> implements UJournalManager{

	UJournalDao ujournalDao;
	
	@Override
	public List<UJournal> findbyusername(String username) {
		// 创建查询条件数据对象
		UJournal queryObjuet = new UJournal();
		queryObjuet.setUsername(username);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() //构件对象
				.withMatcher("username", GenericPropertyMatchers.startsWith())
				.withIgnorePaths("dateCreated", "dateModified");
		//创建实例并查询
		Example<UJournal> example = Example.of(queryObjuet,matcher);
		List<UJournal> result = dao.findAll(example);
		return result;
	}

	@Override
	public List<UJournal> findbyemail(String email) {
		UJournal queryObject = new UJournal();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setEmail(email);
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withStringMatcher(StringMatcher.CONTAINING)
				.withIgnoreCase(true)
				.withMatcher("email", GenericPropertyMatchers.startsWith());
		Example<UJournal> example = Example.of(queryObject,matcher);
		List<UJournal> result = dao.findAll(example);
		return result;
	}
	

	@Autowired
	public void setUJournalDao(UJournalDao ujournalDao) {
		this.ujournalDao = ujournalDao;
		this.dao = this.ujournalDao;
	}
	
	
}

