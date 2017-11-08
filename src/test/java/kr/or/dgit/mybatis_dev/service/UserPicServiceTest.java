package kr.or.dgit.mybatis_dev.service;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.UserPic;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserPicServiceTest {
	
	private static UserPicService userPicService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userPicService = UserPicService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		userPicService = null;
	}

	@Test
	public void testAinsertUserPic() {
		UserPic userPic = new UserPic();
		userPic.setName("HanJiMin");
		userPic.setBio("put some lengthy bio here");
		userPic.setPic(getPicFile());
		
		int result = userPicService.createUserPic(userPic);
		Assert.assertSame(1, result);
	}

	private byte[] getPicFile() {
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir") + "\\DataFiles\\hanjimin.jpg");
		try {
			InputStream is = new FileInputStream(file);
			pic = new byte[is.available()];
			is.read(pic);
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pic;
	}
	
	@Test
	public void testBGetUserPic() {
		UserPic userPic = userPicService.getUserPic(1);
		Assert.assertNotNull(userPic);
	}
}
