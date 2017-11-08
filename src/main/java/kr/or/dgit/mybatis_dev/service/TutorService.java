package kr.or.dgit.mybatis_dev.service;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.TutorDao;
import kr.or.dgit.mybatis_dev.dao.TutorDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class TutorService {
	private static final TutorService instance = new TutorService();
	
	private TutorService() {}

	public static TutorService getInstance() {
		return instance;
	}
	
	public Tutor findTutorById(int tutorId) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			TutorDao tutorDao = new TutorDaoImpl(sqlSession);
			return tutorDao.selectTutorById(tutorId);
		}
	}
	
	public Tutor findTutorByTutorId(Tutor tutor) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			TutorDao tutorDao = new TutorDaoImpl(sqlSession);
			return tutorDao.selectTutorByTutorId(tutor);
		}
	}
}
