package kr.or.dgit.mybatis_dev.dao;

import kr.or.dgit.mybatis_dev.dto.Tutor;

public interface TutorDao {
	Tutor selectTutorById(int tutorId);
	Tutor selectTutorByTutorId(Tutor tutor);
}
