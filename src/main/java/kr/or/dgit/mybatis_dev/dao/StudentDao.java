package kr.or.dgit.mybatis_dev.dao;


import java.util.List;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentDao {
	Student selectStudentByNo(Student student);
	List<Student> selectStudentByAll();	
	
	
	Student selectStudentByNoWithAPI(Student student);
	List<Student> selectStudentByAllWithAPI();
	
	int insertStudent(Student student);
	int insertStudentWithAPI(Student student);
	int insertStudentAutoInc(Student student);
	
	int updateStudent(Student student);
	int updateStudentWithAPI(Student student);
	
	int deleteStudent(int id);
	int delteStudentWithAPI(int id);
}
