package edu.zut.cs.express.Register.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.base.service.impl.GenericManagerImpl;
import edu.zut.cs.express.Register.domain.Register;
import edu.zut.cs.express.Register.dao.RegisterDao;
import edu.zut.cs.express.Register.service.RegisterManager;

@Component
public class RegisterManagerImpl extends GenericManagerImpl<Register, Long> implements RegisterManager {

	RegisterDao RegisterDao;

	@Autowired
	public void setStudentDao(RegisterDao registerDao) {
		this.RegisterDao = registerDao;
		this.dao = this.RegisterDao;
	}
	
	@Override
	public List<Register> findByIdnum(String idnum) {

		// 创建查询条件数据对象
		Register queryObject = new Register();
		queryObject.setIdnum(idnum);
		// 创建匹配器，即如何使用查询条件
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				/*.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
				.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
				.withMatcher("postcode", GenericPropertyMatchers.startsWith()); // 地址采用“开始匹配”的方式查询
*/				.withMatcher("idnum", GenericPropertyMatchers.startsWith())
				.withIgnorePaths("dateCreated", "dateModified");
		
		// 创建实例并查询
		Example<Register> ex = Example.of(queryObject, matcher);
		List<Register> result = dao.findAll(ex);
		return result;
	}

	@Override
	public List<Register> findByUsername(String username) {
		
		// 创建查询条件数据对象
		Register queryObject = new Register();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setUsername(username);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				/*.withMatcher("name", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
*/				.withStringMatcher(StringMatcher.CONTAINING)
				.withIgnoreCase(true)//忽略大小写
				.withMatcher("username", GenericPropertyMatchers.startsWith());
		// 创建实例并查询
		Example<Register> ex = Example.of(queryObject, matcher);
		List<Register> result = dao.findAll(ex);
		return result;
	}


}
