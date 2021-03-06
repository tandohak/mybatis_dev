package kr.or.dgit.mybatis_dev.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentDao;
import kr.or.dgit.mybatis_dev.dao.StudentDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {

	public List<Student> findStudentByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAll();
		}
	}
	
	public List<Student> findStudentByAllWithAPI() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAll();
		}
	}
	
	public Student findStudentByNo(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNo(student);
		}
	}
	
	public Student findStudentByNoWithAPI(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNo(student);
		}
	}
		

	public int insertStudent(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudent(student);
			;
			sqlSession.commit();
			return res;
		}
	}

	public int insertStudentWithAPI(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudentWithAPI(student);
			sqlSession.commit();
			return res;
		}
	}

	public int insertStudentAutoInc(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudentAutoInc(student);
			sqlSession.commit();
			return res;
		}
	}

	public int updateStudent(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.updateStudent(student);
			sqlSession.commit();
			return res;
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		} finally {
			sqlSession.close();
		}
	}

	public int updateStudentWithAPI(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.updateStudentWithAPI(student);
			sqlSession.commit();
			return res;
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		} finally {
			sqlSession.close();
		}
	}
	
	public int updateSetStudent(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.updateSetStudent(student);
			sqlSession.commit();
			return res;
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		} finally {
			sqlSession.close();
		}
	}

	public int delteStudent(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.deleteStudent(student.getStudId());
			sqlSession.commit();
			return res;
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		} finally {
			sqlSession.close();
		}
	}

	public int delteStudentWithAPI(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.delteStudentWithAPI(student.getStudId());
			sqlSession.commit();
			return res;
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		} finally {
			sqlSession.close();
		}
	}

	public List<Student> selectStudentByAllForResultMap() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);;
			return dao.selectStudentByAllForResultMap();
		}
	}

	public List<Student> selectStudentByAllForResultMapWithAPI() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForResultMapWithAPI();
		}
	}
	
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);;
			return dao.selectStudentByAllForHashMap();
		}
	}

	public List<Map<String, Object>> selectStudentByAllForHashMapWithAPI() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForHashMapWithAPI();
		}
	}
	
	public Student findStudentByNoForResultMapeExtends(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoForResultMapExtends(student);
		}
	}
	
	public Student findStudentByNoForResultMapeExtendsWithAPI(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoForResultMapExtendsWithAPI(student);
		}
	}

	public Student findStudentByNoAssociation(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoAssociation(student);
		}
	}
	
	public Student findStudentByNoAssociationWithAPI(Student student) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()) {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoAssociationWithAPI(student);
		}
	}
	
	public int insertEnumStudent(Student student) {
		int res= -1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			res = studentDao.insertEnumStudent(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int insertEnumStudentWithAPI(Student student) {
		int res= -1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			res = studentDao.insertEnumStudentWithAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public Student findAllStudentByParam(String name, String email) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectAllStudentByParam(name, email);
		}
	}
	
	public Student findAllStudentByStudent(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectAllStudentByStudent(student);
		}
	}
	
	public Student findAllStudentByMap(Map<String, String> map) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectAllStudentByMap(map);
		}
	}
	
	public Map<Integer, String> findStudentForMap(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentForMap();
		}
	}
}
