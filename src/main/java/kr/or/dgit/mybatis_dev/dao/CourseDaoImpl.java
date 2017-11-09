package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Course;

public class CourseDaoImpl implements CourseDao {
	private SqlSession sqlSession;
	
	private static final Log log = LogFactory.getLog(CourseDaoImpl.class);
	
	private String namespace = "kr.or.dgit.mybatis_dev.dao.CourseDao.";
	
	
	public CourseDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}



	@Override
	public List<Course> selectCourseByCondition(Map<String, Object> map) {
		log.debug("selectCourseByCondition()");
		return sqlSession.selectList(namespace+"selectCourseByCondition", map);
	}



	@Override
	public List<Course> selectCaseCourses(Map<String, Object> map) {
		log.debug("selectCaseCourses()");
		return sqlSession.selectList(namespace+"selectCaseCourses", map);
	}



	@Override
	public List<Course> selectWhereCondition(Map<String, Object> map) {
		log.debug("selectWhereCondition()");
		return sqlSession.selectList(namespace+"selectWhereCondition", map);
	}



	@Override
	public List<Course> selectTrimCourses(Map<String, Object> map) {
		log.debug("selectTrimCourses()");
		return sqlSession.selectList(namespace+"selectTrimCourses", map);
	}

	@Override
	public List<Course> selectCoursesForeachByTutors(Map<String, Object> map) {
		log.debug("selectCoursesForeachByTutors()");
		return sqlSession.selectList(namespace+"selectCoursesForeachByTutors", map);
	}
}
