package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Student;

public class StudentDaoImpl implements StudentDao{
	private SqlSession sqlSession;
	
	private static final Log log = LogFactory.getLog(StudentDaoImpl.class);
	private String namespace="kr.or.dgit.mybatis_dev.dao.StudentDao.";
	
	public StudentDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Student selectStudentByNo(Student student) {
		log.debug("selectStudentByNo()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByNo(student);
	}

	@Override
	public List<Student> selectStudentByAll() {
		log.debug("selectStudentByAll()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByAll();
	}

	@Override
	public Student selectStudentByNoWithAPI(Student student) {
		log.debug("selectStudentByNoWithAPI()");
		return sqlSession.selectOne(namespace + "selectOne", student);
	}

	@Override
	public List<Student> selectStudentByAllWithAPI() {
		log.debug("selectStudentByAllWithAPI()");
		return sqlSession.selectList(namespace + "selectList"); 
	}

	@Override
	public int insertStudent(Student student) {
		log.debug("insertStudent()");
		return sqlSession.getMapper(StudentDao.class).insertStudent(student);
	}

	@Override
	public int insertStudentWithAPI(Student student) {
		log.debug("insertStudentWithAPI()");
		return sqlSession.insert(namespace+"insertStudentWithAPI", student);
	}

	@Override
	public int insertStudentAutoInc(Student student) {
		log.debug("insertStudentAutoInc()");
		return sqlSession.insert(namespace+"insertStudentAutoInc", student);
	}

	@Override
	public int updateStudent(Student student) {
		log.debug("updateStudent()");
		return sqlSession.getMapper(StudentDao.class).updateStudent(student);
	}

	@Override
	public int updateStudentWithAPI(Student student) {
		log.debug("updateStudentWithAPI()");
		return sqlSession.update(namespace+"updateStudentWithAPI", student);
	}

	@Override
	public int deleteStudent(int id) {
		log.debug("deleteStudent()");
		return sqlSession.getMapper(StudentDao.class).deleteStudent(id);
	}

	@Override
	public int delteStudentWithAPI(int id) {
		log.debug("delteStudentWithAPI()");
		return sqlSession.delete(namespace+"delteStudentWithAPI", id);
	}	
	
}
