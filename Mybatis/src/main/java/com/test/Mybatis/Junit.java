package com.test.Mybatis;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;

public class Junit {
	
	@Inject
	private DataSource ds;
	
	@Test
	public void test() {
		try (Connection conn = ds.getConnection()){
			System.out.println("성공 :" + conn);
		} catch (Exception e) {
			System.out.println("실패 :");
			 e.printStackTrace();
		}
	}
}
