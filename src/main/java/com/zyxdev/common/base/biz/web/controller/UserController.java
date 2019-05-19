//package com.zyxdev.common.base.biz.web.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.zyxdev.common.base.biz.domain.User;
//import com.zyxdev.common.base.biz.service.IUserService;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//	@Autowired
//	private IUserService iUserservice;
//
//	@RequestMapping("/findAll")
//	public List<User> findAll() {
//		System.out.println("find all users");
//		return iUserservice.findAllUser();
//	}
//}
