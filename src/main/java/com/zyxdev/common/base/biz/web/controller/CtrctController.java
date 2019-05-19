package com.zyxdev.common.base.biz.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyxdev.common.base.biz.domain.Ctrct;
import com.zyxdev.common.base.biz.service.ICtrctService;

@RestController
@RequestMapping("/ctrct")
public class CtrctController {
	@Autowired
	private ICtrctService iCtrctService;

	@RequestMapping("/findAll")
	public List<Ctrct> findAll() {
		System.out.println("find all users");
		return iCtrctService.findCtrctByUserId("");
	}
}
