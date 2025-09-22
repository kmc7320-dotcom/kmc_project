package com.spring.mvc_mybatis.ch04.dto;

import java.util.List;

// 검색 키워드 모든 유저 아이디 | 모든 userName
public class SearchDTO_4 {

	// 멤버변수 
	private int[] userIds; 
	private List<String> userNames;  //작성자명
	 //작성자명
	 //게시글정보(게시글 정보, 게시글 내용)
	
	public SearchDTO_4() {
		super();
	}
	

	public List<String> getUserNames() {
		return userNames;
	}


	public void setUserNames(List<String> userNames) {
		this.userNames = userNames;
	}


	public int[] getUserIds() {
		return userIds;
	}


	public void setUserIds(int[] userIds) {
		this.userIds = userIds;
	}



	@Override
	public String toString() {
		return "SearchDTO_4 [userIds=" + userIds + ", userNames=" + userNames + "]";
	}
	
	
	
}

