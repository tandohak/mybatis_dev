package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Address;

public class AddressDaoImpl implements AddressDao {

	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(AddressDaoImpl.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.AddressDao.";
	
	
	
	public AddressDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Address> selectAddressByAll(RowBounds rowBounds) {
		log.debug("selectAddressByAll()");
		return sqlSession.getMapper(AddressDao.class).selectAddressByAll(rowBounds);
	}

	@Override
	public List<Address> selectAddressByAllWithAPI(RowBounds rowBounds) {
		log.debug("selectAddressByAllWithAPI()");
		return sqlSession.selectList(namespace+"selectAddressByAllWithAPI",rowBounds);
	}

}
