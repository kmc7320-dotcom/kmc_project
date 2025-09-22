package com.spring.mvc_mybatis.ch01.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.mvc_mybatis.ch01.dto.UserDTO;

@Repository
public interface UserDAO_ch01 {

	
	
	public List<UserDTO> getAddressInfo_1();

	public List<UserDTO> getAddressInfo_2();
}
