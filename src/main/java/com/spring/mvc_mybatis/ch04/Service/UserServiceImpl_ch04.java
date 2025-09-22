package com.spring.mvc_mybatis.ch04.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.mvc_mybatis.ch04.dao.UserDAO_ch04;
import com.spring.mvc_mybatis.ch04.dto.SearchDTO_4;
import com.spring.mvc_mybatis.ch04.dto.UserDTO_4;

@Service
public class UserServiceImpl_ch04 implements UserService_ch04 {

	@Autowired
	private UserDAO_ch04 dao;

	@Override
	public void getUserInfo1(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("서비스 -getUserInfo1 ");

		SearchDTO_4 search = new SearchDTO_4();

		// id 1,2 를 배열로 생성하여 setter로 전달
		int[] userIds = new int[] { 1, 2 };
		search.setUserIds(userIds);

		// 방법 1 where user id in (1,2)검색
		List<UserDTO_4> list = dao.getUserInfo1(search);
		model.addAttribute("list", list);

		// 방법 2 where user name in (john, smith) 검색
		search.setUserIds(null);
		search.setUserNames(Arrays.asList("john", "smith"));

		List<UserDTO_4> list2 = dao.getUserInfo1(search);
		model.addAttribute("list2", list2);
	}

	@Override
	public void getUserInfo2(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		// id 1,2 를 배열로 생성하여 setter로 전달
		int[] userIds = new int[] { 1, 2 };
		// 방법 1 where user id in (1,2)검색
		dao.getUserInfo2(userIds);

		List<UserDTO_4> list = dao.getUserInfo2(userIds);
		model.addAttribute("list", list);
	}

	@Override
	public void getSearchInfo_3(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		// 방법 2 where user name in (john, smith) 검색
		List<UserDTO_4> list = dao.getUserInfo3(Arrays.asList("john", "smith"));
		model.addAttribute("list", list);

	}

	

//	@Override
//	public void getSearchInfo_1(HttpServletRequest request, HttpServletResponse response, Model model)
//			throws ServletException, IOException {
//		System.out.println("서비스 -getSearchInfo_1 ");
//
//		SearchDTO_3 search = new SearchDTO_3();
//		search.setUserName("john");
//
//		BoardDTO_3 board = new BoardDTO_3();
//		board.setBoardTitle("");
//		board.setBoardContent("반복문");
//		search.setBoardDTO(board);
//		System.out.println(search);
//		List<UserDTO_3> list = dao.getSearchInfo_1(search);
//		model.addAttribute("list", list);
//	}
//
//	@Override
//	public void getSearchInfo_2(HttpServletRequest request, HttpServletResponse response, Model model)
//			throws ServletException, IOException {
//		System.out.println("서비스 -getSearchInfo_2 ");
//
//		SearchDTO_3 search = new SearchDTO_3();
//		search.setUserName("john");
//
//		BoardDTO_3 board = new BoardDTO_3();
//		board.setBoardTitle(null);
//		board.setBoardContent("반복문");
//		search.setBoardDTO(board);
//
//		System.out.println(search);
//		List<UserDTO_3> list = dao.getSearchInfo_2(search);
//		model.addAttribute("list", list);
//	}
//
//	@Override
//	public void getSearchInfo_3(HttpServletRequest request, HttpServletResponse response, Model model)
//			throws ServletException, IOException {
//		System.out.println("서비스 -getSearchInfo_3 ");
//
//		SearchDTO_3 search = new SearchDTO_3();
//		search.setUserName(null);
//
//		BoardDTO_3 board = new BoardDTO_3();
//		board.setBoardTitle(null);
//		board.setBoardContent("활용");
//		search.setBoardDTO(board);
//
//		System.out.println(search);
//		List<UserDTO_3> list = dao.getSearchInfo_3(search);
//		model.addAttribute("list", list);
//
//	}
//
//	@Override
//	public void UpdateUser(HttpServletRequest request, HttpServletResponse response, Model model)
//			throws ServletException, IOException {
//		System.out.println("서비스 -UpdateUser ");
//
//		UserDTO_3 user = new UserDTO_3();
//		user.setUserId(2);
//		user.setUserName("jasmine");
//		user.setRegDate(null);
//
//		int updateCnt = dao.UpdateUser(user);
//
//		if (updateCnt != 0) { // 성공이면
//
//			SearchDTO_3 search = new SearchDTO_3();
//			search.setUserName("jasmine");
//
//			BoardDTO_3 board = new BoardDTO_3();
//			board.setBoardTitle("스프링");
//			board.setBoardContent(null);
//			List<UserDTO_3> list = dao.getSearchInfo_3(search);
//
//			model.addAttribute("list", list);
//			model.addAttribute("updateCnt", updateCnt);
//
//		}
//	}
//
//	@Override
//	public void getUserSearchInfo(HttpServletRequest request, HttpServletResponse response, Model model)
//			throws ServletException, IOException {
//			System.out.println("서비스 -getUserSearchInfo ");
//			UserDTO_3 user = dao.getUserSearchInfo("john");
//			model.addAttribute("user", user);
//	}

}
