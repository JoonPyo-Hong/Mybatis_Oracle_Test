package com.test.Mybatis;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAO {
	@Autowired
	private SqlSessionTemplate template; 
	public int daoseq() {
		
		int result =template.selectOne("Test.seq");
		System.out.println("DAO" + result);
		return result;
	}

}
