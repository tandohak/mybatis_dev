package kr.or.dgit.mybatis_dev.dao;

import kr.or.dgit.mybatis_dev.dto.UserPic;

public interface UserPicDao {
	int insertUserPic(UserPic userPic);
	UserPic getUserPic(int id);
}
