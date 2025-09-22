package com.spring.mvc_mybatis.ch05.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc_mybatis.ch05.dto.UserDTO_5;

@Repository
public class UserDAOImp_ch05 implements UserDAO_ch05 {

	@Autowired
	private SqlSession sqlSession;
	// private SqlSession sqlSession;

	//목록조회	
	@Override
	public List<UserDTO_5> selectUserList() {
		System.out.println("DAO-selectUserList");
		 List<UserDTO_5> list = sqlSession.selectList("com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05.selectUserList");
		return list;
	}
	// 1건조회
	@Override
	public UserDTO_5 selectUser(int userId) {
		System.out.println("DAO-selectUser");
		
		UserDTO_5 user = sqlSession.selectOne("com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05.selectUser",userId);
			
		return user;
	}
	// 인서트 후 목록조회
	@Override
	public int insertUser(UserDTO_5 dto) {
		System.out.println("DAO-insertUser");
		int insertCnt = sqlSession.insert("com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05.insertUser", dto);

		return insertCnt;
	}

	@Override
	public int updateUser(UserDTO_5 dto) {
		System.out.println("DAO-updateUser");
		
		int updateCnt = sqlSession.update("com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05.updateUser", dto);
		return updateCnt;
	}

	@Override
	public int deleteUser(int userId) {
		System.out.println("DAO-deleteUser");
		
		int deleteCnt = sqlSession.delete("com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05.deleteUser", userId);
		
		return deleteCnt;
	}

//	@Override
//	public List<UserDTO_4> getUserInfo1(SearchDTO_4 search) {
//		System.out.println("DAO-getUserInfo1");
//		List<UserDTO_4> list = sqlSession.selectList("com.spring.mvc_mybatis.ch04.dao.UserDAO_ch04.getUserInfo1",search);
//		
//		System.out.println(list);
//		return list;
//	}
//	@Override
//	public List<UserDTO_4> getUserInfo2(int[] userIds) {
//		System.out.println("DAO-getUserInfo2");
//		List<UserDTO_4> list = sqlSession.selectList("com.spring.mvc_mybatis.ch04.dao.UserDAO_ch04.getUserInfo2",userIds);	
//		return list;
//	}
//	@Override
//	public List<UserDTO_4> getUserInfo3(List<String> userNames) {
//		System.out.println("DAO-getUserInfo3");
//		List<UserDTO_4> list = sqlSession.selectList("com.spring.mvc_mybatis.ch04.dao.UserDAO_ch04.getUserInfo3",userNames);	
//		
//		return list;
//	}
//


}
