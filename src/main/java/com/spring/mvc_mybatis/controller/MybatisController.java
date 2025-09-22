package com.spring.mvc_mybatis.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc_mybatis.HomeController;
import com.spring.mvc_mybatis.ch01.service.UserServiceImpl_ch01;
import com.spring.mvc_mybatis.ch02.service.UserServiceImpl_ch02;
import com.spring.mvc_mybatis.ch03.Service.UserServiceImpl_ch03;
import com.spring.mvc_mybatis.ch04.Service.UserServiceImpl_ch04;
import com.spring.mvc_mybatis.ch05.Service.UserServiceImpl_ch05;
import com.spring.mvc_mybatis.ch06.Service.UserServiceImpl_ch06;

@Controller
public class MybatisController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private UserServiceImpl_ch01 service1;
	@Autowired
	private UserServiceImpl_ch02 service2;
	@Autowired
	private UserServiceImpl_ch03 service3;
	@Autowired
	private UserServiceImpl_ch04 service4;
	@Autowired
	private UserServiceImpl_ch05 service5;
	@Autowired
	private UserServiceImpl_ch06 service6;
	
	

	@RequestMapping("/getAddressInfo_1")//성공
	public String getAddressInfo_1(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		logger.info("<<< url ==> /getAddressInfo_1 >>>");

		service1.getAddressInfo_1(request, response, model);
		return "address/getAddressInfo";
	}

	@RequestMapping("/getAddressInfo_2")//성공
	public String getAddressInfo_2(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		logger.info("<<< url ==> /getAddressInfo_2 >>>");

		service1.getAddressInfo_2(request, response, model);
		return "address/getAddressInfo";
	}

	@RequestMapping("/getBoardInfo_1")//성공
	public String getBoardInfo_1(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		logger.info("<<< url ==> /getBoardInfo_1 >>>");

		service2.getBoardInfo_1(request, response, model);
		return "board/getUserBoardInfo";

	}

	@RequestMapping("/getBoardInfo_2")//성공
	public String getBoardInfo_2(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		logger.info("<<< url ==> /getBoardInfo_2 >>>");

		service2.getBoardInfo_2(request, response, model);
		return "board/getUserBoardInfo";

	}

	@RequestMapping("/getSearchInfo_1")//성공
	public String getSearchInfo_1(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		logger.info("<<< url ==> /getSearchInfo_1 >>>");

		service3.getSearchInfo_1(request, response, model);
		return "search/getSearchInfo";

	}
	@RequestMapping("/getSearchInfo_2")//성공
	public String getSearchInfo_2(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		logger.info("<<< url ==> /getSearchInfo_2 >>>");
		
		service3.getSearchInfo_2(request, response, model);
		return "search/getSearchInfo";
		
	}
	@RequestMapping("/getSearchInfo_3")//성공
	public String getSearchInfo_3(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		logger.info("<<< url ==> /getSearchInfo_3 >>>");
		
		service3.getSearchInfo_3(request, response, model);
		return "search/getSearchInfo";
		
	}
	@RequestMapping("/UpdateUser")//성공
	public String UpdateUser(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		logger.info("<<< url ==> /getSearchInfo_3 >>>");
		
		service3.UpdateUser(request, response, model);
		return "search/getSearchInfo2";
		
	}
	@RequestMapping("/getUserSearchInfo")//성공 JSP 안나옴
	public String getUserSearchInfo(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		logger.info("<<< url ==> /getUserSearchInfo >>>");
		
		service3.getUserSearchInfo(request, response, model);
		return "search/getUserSearchInfo";
		
	}
	@RequestMapping("/getUserInfo1")//성공 JSP 안나옴
	public String getUserInfo1(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		
		logger.info("<<< url ==> /getUserInfo1 >>>");
		
		service4.getUserInfo1(request, response, model);
		return "array/array1";
		
	}
	@RequestMapping("/getUserInfo2")//성공 JSP 안나옴
	public String getUserInfo2(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		
		logger.info("<<< url ==> /getUserInfo2 >>>");
		
		service4.getSearchInfo_3(request, response, model);
		return "array/array2";
		
	}
	@RequestMapping("/getUserInfo3")//성공 JSP 안나옴
	public String getUserInfo3(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		
		logger.info("<<< url ==> /getUserInfo3 >>>");
		
		service4.getSearchInfo_3(request, response, model);
		return "array/array3";
		
	}
	//ch05
	
	@RequestMapping("/getUserList")//성공
	public String getUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {

		logger.info("<<< url ==> /getUserList >>>");
		service5.getUserList(request, response, model);
		return "user/getUserList";
	}
	
	@RequestMapping("/getUser")//실패
	public String getUser(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		
		logger.info("<<< url ==> /gegetUsertUserList >>>");
		service5.getUser(request, response, model);
		return "user/getUserList2";
	}
	//insertUser 목록조회
	@RequestMapping("/insertUser")//실패
	public String insertUser(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		
		logger.info("<<< url ==> /insertUser >>>");
		service5.insertUserList(request, response, model);
		return "user/getUserList3";
	}
	//updateUser 목록조회
	@RequestMapping("/updateUser_ch05")//성공
	public String updateUser_ch05(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		
		logger.info("<<< url ==> /updateUser_ch05 >>>");
		service5.updateUserList(request, response, model);
		return "user/getUserList3";
	}
	
	@RequestMapping("/deleteUser")//성공
	public String deleteUser(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		
		logger.info("<<< url ==> /deleteUser >>>");
		service5.deleteUserList(request, response, model);
		return "user/getUserList3";
	}
	
	
	//ch06
	
		@RequestMapping("/ch_06_getUserList")//성공
		public String ch_06_getUserList(HttpServletRequest request, HttpServletResponse response, Model model)
				throws ServletException, IOException {

			logger.info("<<< url ==> /getUserList >>>");
			service6.getUserList(request, response, model);
			return "user/getUserList";
		}
		
		@RequestMapping("/ch_06_getUser")//성공 JSP 안나옴
		public String ch_06_getUser(HttpServletRequest request, HttpServletResponse response, Model model)
				throws ServletException, IOException {
			
			logger.info("<<< url ==> /getUsertUserList >>>");
			service6.getUser(request, response, model);
			return "user/getUserList2";
		}
		//insertUser 목록조회
		@RequestMapping("/ch_06_insertUser")//실패
		public String ch_06_insertUser(HttpServletRequest request, HttpServletResponse response, Model model)
				throws ServletException, IOException {
			
			logger.info("<<< url ==> /insertUser >>>");
			service6.insertUserList(request, response, model);
			return "user/getUserList3";
		}
		//updateUser 목록조회
		@RequestMapping("/ch_06_updateUser")//성공
		public String ch_06_updateUser(HttpServletRequest request, HttpServletResponse response, Model model)
				throws ServletException, IOException {
			
			logger.info("<<< url ==> /ch_06_updateUser >>>");
			service6.updateUserList(request, response, model);
			return "user/getUserList3";
		}
		
		@RequestMapping("/ch_06_deleteUser")//성공
		public String ch_06_deleteUser(HttpServletRequest request, HttpServletResponse response, Model model)
				throws ServletException, IOException {
			
			logger.info("<<< url ==> /ch_06_deleteUser >>>");
			service6.deleteUserList(request, response, model);
			return "user/getUserList3";
		}
		
		
	
	
	
	
	
	
}