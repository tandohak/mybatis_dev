package kr.or.dgit.mybatis_dev.service;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.UserPicDao;
import kr.or.dgit.mybatis_dev.dao.UserPicDaoImpl;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class UserPicService {
	private static final UserPicService instance = new UserPicService();
	
	private UserPicService() {}
	
	public static UserPicService getInstance() {
		return instance;
	}
	
	public int createUserPic(UserPic userPic) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		int res = -1;
		try {
			UserPicDao userPicDao = new  UserPicDaoImpl(sqlSession);
			res = userPicDao.insertUserPic(userPic);
			sqlSession.commit();
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}finally {
			sqlSession.close();
		}
		return res;
	}
	
	public UserPic getUserPic(int id) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			UserPicDao userPicDao = new  UserPicDaoImpl(sqlSession);
			return userPicDao.getUserPic(id);
		}
	}
}
