package kr.or.dgit.mybatis_dev.dao;


import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentDao {
	Student selectStudentByNo(Student student);
	Student selectStudentByNoWithAPI(Student student);	
	
	List<Student> selectStudentByAll();	
	List<Student> selectStudentByAllWithAPI();
	List<Student> selectStudentByAllForResultMap();	
	List<Student> selectStudentByAllForResultMapWithAPI();
	List<Map<String, Object>> selectStudentByAllForHashMap();	
	List<Map<String, Object>> selectStudentByAllForHashMapWithAPI();
	
	int insertStudent(Student student);
	int insertStudentWithAPI(Student student);
	int insertStudentAutoInc(Student student);
	
	int updateStudent(Student student);
	int updateStudentWithAPI(Student student);
	
	int deleteStudent(int id);
	int delteStudentWithAPI(int id);
	
	Student selectStudentByNoForResultMapExtends(Student student);
	Student selectStudentByNoForResultMapExtendsWithAPI(Student student);
}
