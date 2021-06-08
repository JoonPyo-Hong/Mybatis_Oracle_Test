package com.test.Mybatis;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IServiceImpl implements IService{

	@Autowired
	private DAO dao;

	@Override
	public int seq() {
		System.out.println("Service");
		return dao.daoseq();
	}
	

}
