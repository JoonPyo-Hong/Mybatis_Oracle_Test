package com.test.Mybatis;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
@Service
public class IServiceImpl implements IService{

	@Autowired
	private DAO dao;

	@Override
	public List<DTO> seq() throws DataAccessException{
		
		return dao.daoseq();
	}
	

}
