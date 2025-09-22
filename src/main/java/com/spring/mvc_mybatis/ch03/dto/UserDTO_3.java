package com.spring.mvc_mybatis.ch03.dto;

import java.sql.Date;
import java.util.List;

//1:1 => UserDTO(부모T) AddressDTO => user 1명이 주소 1개를 가지고 있다. (1:1 관계)
public class UserDTO_3 {

	// 멤버변수 
	
	private int userId; //PK => mvc_user_tbl -user_id 
	private String userName; //mvc_user_tbl -user_name
	private Date regDate; //mvc_user_tbl - reg_date   
	private List<BoardDTO_3> boardDTO;//mvc_address_tbl- 내포하고있다. user_id 가 FK
	
	
	
	public UserDTO_3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public UserDTO_3(int userId, String userName, Date regDate, List<BoardDTO_3> boardDTO) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.regDate = regDate;
		this.boardDTO = boardDTO;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Date getRegDate() {
		return regDate;
	}



	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}



	public List<BoardDTO_3> getBoardDTO() {
		return boardDTO;
	}



	public void setBoardDTO(List<BoardDTO_3> boardDTO) {
		this.boardDTO = boardDTO;
	}



	@Override
	public String toString() {
		return "UserDTO_2 [userId=" + userId + ", userName=" + userName + ", regDate=" + regDate + ", boardDTO="
				+ boardDTO + "]";
	}
	
	
	
	
	
	
}


