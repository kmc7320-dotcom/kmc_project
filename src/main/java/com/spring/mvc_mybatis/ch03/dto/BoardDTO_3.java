package com.spring.mvc_mybatis.ch03.dto;


//1:1 => UserDTO(부모T) AddressDTO => user 1명이 주소 1개를 가지고 있다. (1:1 관계)
public class BoardDTO_3 {

	// 멤버변수 
	
	private int boardNum; //PK => mvc_user_tbl -user_id 
	private String boardTitle ; //mvc_user_tbl -user_name
	private String boardContent;
	
	
	public BoardDTO_3() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BoardDTO_3(int boardNum, String boardTitle, String boardContent) {
		super();
		this.boardNum = boardNum;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
	}


	public int getBoardNum() {
		return boardNum;
	}


	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}


	public String getBoardTitle() {
		return boardTitle;
	}


	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}


	public String getBoardContent() {
		return boardContent;
	}


	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}


	@Override
	public String toString() {
		return "BoardDTO_2 [boardNum=" + boardNum + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ "]";
	}
	
	
	
	
	
	
	 //mvc_user_tbl - reg_date   
	//private AddressDTO board_content ;//mvc_address_tbl- 내포하고있다. user_id 가 FK
//	
//	board_num    NUMBER(3) PRIMARY KEY,
//	board_title  VARCHAR2(50),
//	board_content VARCHAR2(100),
//	user_id 	 NUMBER(2),
	

	
}

