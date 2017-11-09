package kr.or.dgit.mybatis_dev.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.dto.CourseService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseServiceTest {
	private static CourseService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = CourseService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void testFindCoursesByCondition() {
		GregorianCalendar cal = new GregorianCalendar(2013,1,1);
		Map<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		map.put("courseName", "%java%");
		map.put("startDate", cal.getTime());
		
		List<Course> courses = service.findCoursesByCondition(map);
		Assert.assertNotNull(courses);
	}
	
	@Test
	public void testFindCaseCourses() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("searchBy", "Tutor");
		map.put("tutorId", 1);
		
		List<Course> courses = service.findCaseCourses(map);
		Assert.assertNotNull(courses);
		
		map.replace("searchBy", "CourseName");
		map.remove("tutorId");
		map.put("courseName", "%java");
		courses = service.findCaseCourses(map);		
		Assert.assertNotNull(courses);
	}
	
	@Test
	public void testWhereCondition() {
		
		Map<String, Object> map = new HashMap<>();
		
		List<Course> courses = service.findWhereCondition(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		courses = service.findWhereCondition(map);		
		Assert.assertNotNull(courses);
		
		map.put("courseName", "%java%");
		courses = service.findWhereCondition(map);		
		Assert.assertNotNull(courses);
		
		map.clear();
		map.put("endDate", new Date());
		courses = service.findWhereCondition(map);		
		Assert.assertNotNull(courses);
	}
	
	@Test
	public void testTrimCourses() {
		
		Map<String, Object> map = new HashMap<>();
		
		List<Course> courses = service.findTrimCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		courses = service.findTrimCourses(map);		
		Assert.assertNotNull(courses);
		
		map.put("courseName", "%java%");
		courses = service.findTrimCourses(map);		
		Assert.assertNotNull(courses);
		
	}
	
	@Test
	public void testfindCoursesForeachByTutors() {
		
		List<Integer> tutorIds = new ArrayList<>();
		tutorIds.add(1);
		tutorIds.add(2);
		
		Map<String, Object> map = new HashMap<>();
		map.put("tutorIds", tutorIds);
		
		List<Course> courses = service.findCoursesForeachByTutors(map);
		Assert.assertNotNull(courses);
	}
}
