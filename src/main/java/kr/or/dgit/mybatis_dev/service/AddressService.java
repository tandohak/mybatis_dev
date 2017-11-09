package kr.or.dgit.mybatis_dev.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.AddressDao;
import kr.or.dgit.mybatis_dev.dao.AddressDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class AddressService {
	private static final AddressService instance = new AddressService();

	
	public static AddressService getInstance() {
		return instance;
	}


	public List<Address> findAddressByAll(RowBounds rowBounds){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			AddressDao addressDao = new AddressDaoImpl(sqlSession);
			return addressDao.selectAddressByAll(rowBounds);
		}
	}
	
	public List<Address> findAddressByAllWithAPI(RowBounds rowBounds){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			AddressDao addressDao = new AddressDaoImpl(sqlSession);
			return addressDao.selectAddressByAllWithAPI(rowBounds);
		}
	}
}
