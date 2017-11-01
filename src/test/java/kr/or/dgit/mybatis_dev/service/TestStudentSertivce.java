package kr.or.dgit.mybatis_dev.service;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStudentSertivce {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testAFindStudentByNo() {
		Student student = new Student();
		student.setStudId(1);
		
		Student findStudent = studentService.findStudentByNo(student);
		Assert.assertEquals(1, findStudent.getStudId());
	}
	
	@Test
	public void testBSelectStudentByAll() {
		List<Student> lists =studentService.findStudentByAll();
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void testCFindStudentByNoWithAPI() {
		Student student = new Student();
		student.setStudId(1);
		
		Student findStudent = studentService.findStudentByNoWithAPI(student);
		Assert.assertEquals(1, findStudent.getStudId());
	}
	
	@Test
	public void testDSelectStudentByAllWithAPI() {
		List<Student> lists =studentService.findStudentByAllWithAPI();
		Assert.assertNotNull(lists);
	}

	@Test
	public void testEInsetStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1993, 3, 28);
		Student student = new Student(3, "테스트", "text@test.co.kr", new PhoneNumber("010-1234-1234"), newDate.getTime());
		
		int res = studentService.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testFInsetStudentWithAPI() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1993, 3, 28);
		Student student = new Student(4, "테스트2", "text2@test.co.kr", new PhoneNumber("010-4567-1234"), newDate.getTime());
		
		int res = studentService.insertStudentWithAPI(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testGInsertStudentAutoInc() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1993, 3, 28);
		Student student = new Student("테스트3", "text2@test.co.kr", new PhoneNumber("010-4567-1234"), newDate.getTime());
		
		int res = studentService.insertStudentAutoInc(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testHupdateStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1993, 3, 28);
		Student student = new Student(3, "테스트2d", "text2@test.co.kr", new PhoneNumber("010-4567-1234"), newDate.getTime());
		
		int res = studentService.updateStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testIupdateStudentWithAPI() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1993, 3, 28);
		Student student = new Student(4,"테스트3d", "text2@test.co.kr", new PhoneNumber("010-4567-1234"), newDate.getTime());
		
		int res = studentService.updateStudentWithAPI(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testJdeleteStudent() {
		
		Student student = new Student();
		student.setStudId(3);
		
		int res = studentService.delteStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testKdelteStudentWithAPI() {
		
		Student student = new Student();
		student.setStudId(4);
		
		int res = studentService.delteStudentWithAPI(student);
		Assert.assertEquals(1, res);
	}
		
	
}
