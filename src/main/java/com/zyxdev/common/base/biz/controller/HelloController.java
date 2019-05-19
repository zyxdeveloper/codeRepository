package com.zyxdev.common.base.biz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class HelloController {
	@RequestMapping("hello")
	public String helloWorld() {
		return "hello world aa bb";
	}
}
