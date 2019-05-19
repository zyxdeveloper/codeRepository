package com.zyxdev.common.base.biz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyxdev.common.base.biz.dao.ICtrctDao;
import com.zyxdev.common.base.biz.domain.Ctrct;
import com.zyxdev.common.base.biz.service.ICtrctService;

@Service
public class CtrctServiceImpl implements ICtrctService {

	@Autowired
	private ICtrctDao ctrctDao;

	@Override
	public List<Ctrct> findCtrctByUserId(String userId) {
		// TODO Auto-generated method stub
		return ctrctDao.findAll();
	}

}
