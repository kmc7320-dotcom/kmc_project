package com.spring.mvc_mybatis.ch05.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.mvc_mybatis.ch05.dto.UserDTO_5;

@Repository
public interface UserDAO_ch05 {

	
	
	public List<UserDTO_5> selectUserList();

	public UserDTO_5 selectUser(int userId);
	
	
	public int insertUser(UserDTO_5 dto);

	public int updateUser(UserDTO_5 dto);
	
	public int deleteUser(int userId);

	
}
