package kr.or.dgit.mybatis_dev.service;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Gender;
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
	
	/*@Test
	public void testGInsertStudentAutoInc() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1993, 3, 28);
		Student student = new Student("테스트3", "text2@test.co.kr", new PhoneNumber("010-4567-1234"), newDate.getTime());
		
		int res = studentService.insertStudentAutoInc(student);
		Assert.assertEquals(1, res);
	}*/
	
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
	
	@Test
	public void testLSelectStudentByAllForResultMap() {
		List<Student> lists =studentService.selectStudentByAllForResultMap();
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void testNSelectStudentByAllForResultMapWithAPI() {
		List<Student> lists =studentService.selectStudentByAllForResultMapWithAPI();
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void testMSelectStudentByAllForHashMap() {
		List<Map<String, Object>> lists =studentService.selectStudentByAllForHashMap();
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void testOSelectStudentByAllForResultMapWithAPI() {
		List<Map<String, Object>> lists =studentService.selectStudentByAllForHashMapWithAPI();
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void testPfindStudentByNoForResultMapeExtends() {
		Student student = new Student();
		student.setStudId(1);
		
		Student extStd = studentService.findStudentByNoForResultMapeExtends(student);
		Student extStdApi = studentService.findStudentByNoForResultMapeExtendsWithAPI(student);
		Assert.assertEquals(extStd, extStdApi);
	}
	
	@Test
	public void testQselectStudentByNoAssociation() {
		Student student = new Student();
		student.setStudId(1);
		
		Student extStd = studentService.findStudentByNoAssociation(student);
		Student extStdApi = studentService.findStudentByNoAssociationWithAPI(student);
		
		Assert.assertEquals(extStd.getStudId(), extStdApi.getStudId());
	}
	
	@Test
	public void testRInsetEnumStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1993, 3, 28);
		Student student = new Student();
		student.setName("test");
		student.setEmail("test@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		student.setGender(Gender.FEMALE);

		int res = studentService.insertEnumStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testSInsetEnumStudentWithAPI() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1993, 3, 28);
		Student student = new Student();
		student.setName("test");
		student.setEmail("test@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		student.setGender(Gender.MALE);
		
		int res = studentService.insertEnumStudentWithAPI(student);
		Assert.assertEquals(1, res);
	}

	@Test
	public void testTFindAllStudentByParam() {
		Student student= studentService.findAllStudentByParam("Timothy", "timothy@gmail.com");
		Assert.assertNotNull(student);
	}
	@Test
	public void testUFindAllStudentByStudent() {
		Student std = new Student();
		std.setName("Timothy");
		std.setEmail("timothy@gmail.com");
		Student student= studentService.findAllStudentByStudent(std);
		Assert.assertNotNull(student);
	}
	@Test
	public void testVindAllStudentByMap() {
		Map<String, String> maps = new HashMap<>();
		maps.put("name", "Timothy");
		maps.put("email", "timothy@gmail.com");
		Student student= studentService.findAllStudentByMap(maps);
		Assert.assertNotNull(student);
	}
	@Test
	public void testFindStudentForMap() {
		Map<Integer,String> map = studentService.findStudentForMap();
		Assert.assertNotNull(map);
		
		for(Entry<Integer,String> entry : map.entrySet()) {
			System.out.printf("key(%s) = value(%s)%n", entry.getKey(), entry.getValue());
		}
	}
}
