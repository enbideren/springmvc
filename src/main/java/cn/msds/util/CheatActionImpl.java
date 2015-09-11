package cn.msds.util;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.msds.model.Apply;
import cn.msds.service.ApplyService;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("CheatAction")
public class CheatActionImpl {
	@Resource
	private ApplyService applyService;	
	/**
	 * 同一用户关联手机号数量
	 * @author JZR	
	 * @param 
	 * @return
	 */
	public int getPhones(String uuid) {
		Apply apply = new Apply();
		apply.setUuid(uuid);
		List<Apply> list = applyService.getApplyByCondition(apply);
//		System.out.println(list.size());
		return list.size();
	}
	/**
	 * 同一手机号管理用户数量
	 * @author JZR	
	 * @param 
	 * @return
	 */
	public int getCusts(String phoneNum){
		Apply apply = new Apply();
		apply.setPhoneNum(phoneNum);
		List<Apply> list = applyService.getApplyByCondition(apply);
//		System.out.println(list.size());
		return list.size();
	}
	public int getIps(String uuid){
		Date start = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(start);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		start = calendar.getTime();
		Date end = new Date();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("uuid", uuid);
		map.put("start", start);
		map.put("end", end);
		int result = applyService.getIpCount(map);
//		System.out.println(result);
		return result;
	}
}
