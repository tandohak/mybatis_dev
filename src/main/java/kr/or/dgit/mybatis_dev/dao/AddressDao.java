package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import kr.or.dgit.mybatis_dev.dto.Address;

public interface AddressDao {
	List<Address> selectAddressByAll(RowBounds rowBounds);
	List<Address> selectAddressByAllWithAPI(RowBounds rowBounds);
}
