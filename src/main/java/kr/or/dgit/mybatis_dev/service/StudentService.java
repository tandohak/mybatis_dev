package kr.or.dgit.mybatis_dev.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentDao;
import kr.or.dgit.mybatis_dev.dao.StudentDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {
	
	public Student findStudentByNo(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNo(student);
		}	
	}
	
	public List<Student> findStudentByAll() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAll();
		}	
	}
	
	public Student findStudentByNoWithAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNo(student);
		}	
	}
	
	public List<Student> findStudentByAllWithAPI() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAll();
		}	
	}
	
	public int insertStudent(Student student) {
		int res = -1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudent(student);;
			sqlSession.commit();
			return res;
		}
	}
	
	public int insertStudentWithAPI(Student student) {
		int res = -1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudentWithAPI(student);
			sqlSession.commit();
			return res;
		}
	}
	
	public int insertStudentAutoInc(Student student) {
		int res = -1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudentAutoInc(student);
			sqlSession.commit();
			return res;
		}
	}
	
	public int updateStudent(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try{
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.updateStudent(student);
			sqlSession.commit();
			return res;
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();	
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	}
	
	public int updateStudentWithAPI(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try{
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.updateStudentWithAPI(student);
			sqlSession.commit();
			return res;
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();	
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	}
	
	public int delteStudent(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try{
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.deleteStudent(student.getStudId());
			sqlSession.commit();
			return res;
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();	
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	}
	
	public int delteStudentWithAPI(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try{
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.delteStudentWithAPI(student.getStudId());
			sqlSession.commit();
			return res;
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();	
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
	}
}
