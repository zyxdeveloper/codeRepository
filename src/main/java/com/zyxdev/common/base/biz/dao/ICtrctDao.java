package com.zyxdev.common.base.biz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zyxdev.common.base.biz.domain.Ctrct;

@Repository("ctrctDao")
public interface ICtrctDao extends JpaRepository<Ctrct, String> {

}
