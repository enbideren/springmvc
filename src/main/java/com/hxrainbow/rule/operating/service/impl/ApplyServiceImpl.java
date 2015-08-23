package com.hxrainbow.rule.operating.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxrainbow.rule.model.Apply;
import com.hxrainbow.rule.operating.dao.ApplyDao;
import com.hxrainbow.rule.operating.service.ApplyService;

/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("ApplyService")
public class ApplyServiceImpl implements ApplyService{
	@Autowired
	private ApplyDao applyDao;

	@Override
	public void saveApply(Apply apply) {
		applyDao.saveApply(apply);
	}
}
