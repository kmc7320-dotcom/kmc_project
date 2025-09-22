package com.spring.mvc_mybatis.ch04.dto;

import java.sql.Date;

//1:1 => UserDTO(부모T) AddressDTO => user 1명이 주소 1개를 가지고 있다. (1:1 관계)
public class UserDTO_4 {

	// 멤버변수

	private int userId; // PK => mvc_user_tbl -user_id
	private String userName; // mvc_user_tbl -user_name
	private Date regDate; // mvc_user_tbl - reg_date

	public UserDTO_4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO_4(int userId, String userName, Date regDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.regDate = regDate;
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

	@Override
	public String toString() {
		return "UserDTO_2 [userId=" + userId + ", userName=" + userName + ", regDate=" + regDate  + "]";
	}

}
