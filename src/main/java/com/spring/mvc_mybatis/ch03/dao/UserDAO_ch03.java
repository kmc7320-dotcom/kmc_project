package com.spring.mvc_mybatis.ch03.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.mvc_mybatis.ch03.dto.SearchDTO_3;
import com.spring.mvc_mybatis.ch03.dto.UserDTO_3;

@Repository
public interface UserDAO_ch03 {

	
	
	public List<UserDTO_3> getSearchInfo_1(SearchDTO_3 search);

	public List<UserDTO_3> getSearchInfo_2(SearchDTO_3 search);
	
	public List<UserDTO_3> getSearchInfo_3(SearchDTO_3 search);

	public int UpdateUser(UserDTO_3 user);
	
	public UserDTO_3 getUserSearchInfo(String username);
	
}
