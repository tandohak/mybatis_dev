package kr.or.dgit.mybatis_dev.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.UserPic;

public class UserPicDaoImpl implements UserPicDao {
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(UserPicDao.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.UserPicDao.";
	
	
	
	public UserPicDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int insertUserPic(UserPic userPic) {
		log.debug("insertUserPic()");
		return sqlSession.insert(namespace + "insertUserPic", userPic);
	}

	@Override
	public UserPic getUserPic(int id) {
		log.debug("getUserPic()");
		return sqlSession.selectOne(namespace + "getUserPic", id);
	}

}
