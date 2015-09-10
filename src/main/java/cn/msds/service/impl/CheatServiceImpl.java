package cn.msds.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.msds.dao.CheatDao;
import cn.msds.model.Cheat;
import cn.msds.service.CheatService;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("cheatService")
public class CheatServiceImpl implements CheatService{

	@Resource
	private CheatDao cheatDao;

	@Override
	public int addCheat(Cheat cheat) {
		return cheatDao.addCheat(cheat);
	}

	@Override
	public List<Cheat> getCheatByUuid(Cheat cheat) {
		return cheatDao.getCheatByUuid(cheat);
	}


}
