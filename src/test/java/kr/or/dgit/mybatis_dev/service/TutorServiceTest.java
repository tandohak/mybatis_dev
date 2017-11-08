package kr.or.dgit.mybatis_dev.service;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Tutor;

public class TutorServiceTest {
	
	private static TutorService tutorService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tutorService = TutorService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		tutorService = null;
	}

	@Test
	public void aTestFindStudent() {
		Tutor tutor = tutorService.findTutorById(1);
		
		Tutor findTutor = new Tutor();
		findTutor.setTutorId(1);
		Tutor tutor2 = tutorService.findTutorByTutorId(findTutor);
		
		Assert.assertEquals(tutor.getTutorId(), tutor2.getTutorId());
	}

}
