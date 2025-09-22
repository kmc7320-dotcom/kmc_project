package com.spring.mvc_mybatis.ch06.Service;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.mvc_mybatis.ch06.dao.UserDAO_ch06;
import com.spring.mvc_mybatis.ch06.dto.UserDTO_6;

@Service
public class UserServiceImpl_ch06 implements UserService_ch06 {

	@Autowired
	private UserDAO_ch06 dao;

	@Override
	public void getUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("서비스 -getUserList ");
		List<UserDTO_6> list = dao.selectUserList();
		model.addAttribute("list", list);
	}

	@Override
	public void getUser(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("서비스 -getUser ");
		UserDTO_6 user = dao.selectUser(1);
		model.addAttribute("user", user);
	}

	@Override
	public void insertUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("서비스 -insertUserList ");
		UserDTO_6 user = new UserDTO_6(6, "ano", Date.valueOf("2025-08-13"));
		int cnt = dao.insertUser(user);

		List<UserDTO_6> list = dao.selectUserList();
		model.addAttribute("cnt", cnt);
		model.addAttribute("list", list);
	}

	@Override
	public void updateUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("서비스 -updateUserList ");
		UserDTO_6 dto = new UserDTO_6(6, "조국", Date.valueOf("2025-08-16"));
		int cnt = dao.updateUser(dto);

		List<UserDTO_6> list = dao.selectUserList();

		model.addAttribute("cnt", cnt);
		model.addAttribute("list", list);

	}

	@Override
	public void deleteUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("서비스 -deleteUserList ");
		UserDTO_6 dto = new UserDTO_6(4, "조국", Date.valueOf("2025-08-16"));
		
		int cnt = dao.deleteUser(1);

		List<UserDTO_6> list = dao.selectUserList();

		model.addAttribute("cnt", cnt);
		model.addAttribute("list", list);

		
		
	}



}
