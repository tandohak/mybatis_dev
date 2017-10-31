package kr.or.dgit.mybatis_dev.util;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMybatisSqlSessionFactory {

	private static SqlSessionFactory factory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		factory = MyBatisSqlSessionFactory.getSqlSessionFactory();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		factory = null;
	}
	
	@Test
	public void testASqlSessionFactory() {
		factory = MyBatisSqlSessionFactory.getSqlSessionFactory();
		Assert.assertNotNull(factory);
	}
	
	@Test
	public void testBOpenSession() {
		Connection con =  factory.openSession().getConnection();
		Assert.assertNotNull(con);
	}

}
