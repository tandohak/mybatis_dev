package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Course;

public interface CourseDao {
	List<Course> selectCourseByCondition(Map<String, Object> map);
	
	List<Course> selectCaseCourses(Map<String, Object> map);

	List<Course> selectWhereCondition(Map<String, Object> map);
	
	List<Course> selectTrimCourses(Map<String, Object> map);

	List<Course> selectCoursesForeachByTutors(Map<String, Object> map);
}
