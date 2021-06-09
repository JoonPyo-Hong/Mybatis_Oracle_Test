package com.test.Mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAO {
	@Autowired
	SqlSession sql;
	public List<DTO> daoseq() {
		
		List<DTO> result =sql.selectList("test.seq");
		
		return result;
	}

}
