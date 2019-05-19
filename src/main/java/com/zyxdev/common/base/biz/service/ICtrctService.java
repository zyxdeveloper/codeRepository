package com.zyxdev.common.base.biz.service;

import java.util.List;

import com.zyxdev.common.base.biz.domain.Ctrct;

public interface ICtrctService {

	List<Ctrct> findCtrctByUserId(String userId);
}
