package edu.zut.cs.express.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.base.service.impl.GenericManagerImpl;
import edu.zut.cs.express.manager.dao.JournalDao;
import edu.zut.cs.express.manager.domain.Journal;
import edu.zut.cs.express.admin.service.JournalManager;

@Component
public class JournalManagerImpl extends GenericManagerImpl<Journal, Long> implements JournalManager {

	JournalDao journalDao;

	@Autowired
	public void setJournalDao(JournalDao JournalDao) {
		this.dao = this.journalDao;
	}

	@Override
	public List<Journal> FindAll(String userId) {
		// 创建查询条件数据对象
		Journal queryObject = new Journal();
		queryObject.setUserId(userId);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("fullall", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
		// 创建实例并查询
		Example<Journal> ex = Example.of(queryObject, matcher);
		List<Journal> result = dao.findAll(ex);
		return result;
	}

}

