package com.spring.mvc_mybatis.ch03.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc_mybatis.ch03.dto.SearchDTO_3;
import com.spring.mvc_mybatis.ch03.dto.UserDTO_3;

@Repository
public class UserDAOImp_ch03 implements UserDAO_ch03 {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<UserDTO_3> getSearchInfo_1(SearchDTO_3 search) {
		System.out.println("DAO-getSearchInfo_1");
		
		 List<UserDTO_3> list = sqlSession.selectList("com.spring.mvc_mybatis.ch03.dao.UserDAO_ch03.getSearchInfo_1", search);
		 System.out.println(list);
		return list;
	}

	@Override
	public List<UserDTO_3> getSearchInfo_2(SearchDTO_3 search) {
		System.out.println("DAO-getSearchInfo_2");
		List<UserDTO_3> list = sqlSession.selectList("com.spring.mvc_mybatis.ch03.dao.UserDAO_ch03.getSearchInfo_2", search);
		 System.out.println(list);
		return list;
	}

	@Override
	public List<UserDTO_3> getSearchInfo_3(SearchDTO_3 search) {
		System.out.println("DAO-getSearchInfo_3");
		List<UserDTO_3> list = sqlSession.selectList("com.spring.mvc_mybatis.ch03.dao.UserDAO_ch03.getSearchInfo_3", search);
		 System.out.println(list);
		return list;
	}

	@Override
	public int UpdateUser(UserDTO_3 user) {
		System.out.println("DAO-UpdateUser");
		
		int updateCnt = sqlSession.update("com.spring.mvc_mybatis.ch03.dao.UserDAO_ch03.updateUser", user);
		 
		System.out.println(updateCnt);
		
		return  updateCnt;
		
	}

	
	@Override
	public UserDTO_3 getUserSearchInfo(String username) {
		System.out.println("DAO-getUserSearchInfo");
		UserDTO_3 user = sqlSession.selectOne("com.spring.mvc_mybatis.ch03.dao.UserDAO_ch03.getUserSearchInfo", username);
		 System.out.println(user);
		return user;
	
	}


	

	
}
