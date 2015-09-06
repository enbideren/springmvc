package cn.springmvc.test;

import java.util.HashMap;
import java.util.Map;

import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.QueryResults;
import org.drools.runtime.rule.QueryResultsRow;
import org.junit.Test;

import cn.msds.model.Apply;
import cn.msds.model.Business;
import cn.msds.model.User;
import cn.springmvc.util.DateUtils;
import cn.springmvc.util.ruleUtil.RuleUtil;


public class RuleTest {
	@Test
	public void applyBase() throws Exception{
		User user = new User(1000);
//		User user = getUser("张19");
//		Business business = new Business(DateUtils.StringToDate("20150820", "yyyyMMdd"),9);
		Business business = getBusiness("张34");
		Apply apply = new Apply();
//		List<String> list = new ArrayList<String>();
//		list.add("rules/ApplyRule.drl");
//		StatefulKnowledgeSession session = RuleUtil.getDrlSession(list);
//		session.insert(business);
//		session.insert(user);
//		session.insert(apply);
//		session.fireAllRules();
		Object [] objects = new Object[]{business,user,apply};
		StatefulKnowledgeSession session = RuleUtil.doRuleQuery("rules/ApplyRule.drl", objects);
		QueryResults queryResult = session.getQueryResults("end Apply");
		for (QueryResultsRow queryResultsRow : queryResult) {
			Apply loanMoney = (Apply)queryResultsRow.get("apply");
			System.out.println(loanMoney.getPreResult());
		}
		session.dispose();
	}
	@Test
	public void applyUserType() throws Exception{
//		User user = new User(1000);
		User user = getUser("张34");
//		Business business = new Business(DateUtils.StringToDate("20150820", "yyyyMMdd"),9);
		Business business = getBusiness("张34");
		Apply apply = new Apply();
		Object [] objects = new Object[]{business,user,apply};
		StatefulKnowledgeSession session = RuleUtil.doRuleQuery("rules/ApplyAssortRule.drl", objects);
		QueryResults queryResult = session.getQueryResults("end Apply");
		for (QueryResultsRow queryResultsRow : queryResult) {
			Apply loanMoney = (Apply)queryResultsRow.get("apply");
			System.out.println(loanMoney.getUserType());
		}
		session.dispose();
	}
	public static User getUser(String id){
		Map<String, User> map = new HashMap<String, User>();
		map.put("张1", new User("张1","131026197708092331",0,"13310890120",0,0,0,0,"李1","13522371210","test30@126.com",2, 1000 ,9928,1));
		map.put("张2", new User("张2","131026197708092331",1,"13310890121",1,1,1,1,"李2","13522371211","test30@126.com",2, 10000 ,3908,1));
		map.put("张3", new User("张3","131026197708092331",1,null,2,2,2,2,"李3","13522371212","test30@126.com",2, 20000 ,2312,1));
		map.put("张4", new User("张4","131026197708092331",2,"13310890211",0,0,0,0,"李4","13522371213","test30@126.com",2, 50000 ,2322,1));
		map.put("张6", new User("张6","131026197708092331",1,"1331089021",2,2,2,2,"李6","13522371215","test30@126.com",1, 50000 ,2332,1));
		map.put("张7", new User("张7","131026197708092331",2,"13310890124",0,0,0,0,"李7","1352371216","test30@126.com",1, 50000 ,2342,1));
		map.put("张8", new User("张8","131026197708092331",0,"13310890125",1,1,1,1,null,"13522371217","test30@126.com",1, 50000 ,2352,1));
		map.put("张9", new User("张9","131026197708092331",1,"13310890126",2,2,2,2,"张9","13522371218","test30@126.com",1, 50000 ,2362,1));
		map.put("张10", new User("张10","131026197708092331",1,"13310890127",0,0,0,0,"李10","13310890127","test30@126.com",0, 50000 ,2372,1));
		map.put("张11", new User("张11","131026197708092331",2,"13310890128",1,1,1,1,"李11","13522371220","test30@126.com",0,null,2382,1));
		map.put("张12", new User("张12","131026197708092331",1,"13310890129",2,2,2,null,"李12","13522371221","test30@126.com",0, 50000 ,2392,1));
		map.put("张13", new User("张13","131026197708092331",1,"13310890130",0,0,0,0,"李13","13522371222","test30@126.com",0, 50000 ,2402,1));
		map.put("张14", new User("张14","131026197708092331",2,"13310890131",1,1,1,1,"李14","13522371223","test30@126.com",0, 1000 ,2412,1));
		map.put("张15", new User("张15","131026197708092331",0,"13310890132",2,2,2,2,"李15","13522371224","test30@126.com",2, 99999999 ,2422,1));
		map.put("张17", new User("张17","131026197708092331",1,"13310890134",1,1,1,1,"李17","13522371226","test30@126.com",2, 50000 ,2432,1));
		map.put("张18", new User("张18","131026197708092331",2,"13310890135",2,2,2,2,"李18","13522371227","test30@126.com",2, 50000 ,2442,1));
		map.put("张19", new User("张19","131026197708092331",1,"13310890136",0,0,0,2,"李19","13522371228","test30@126.com",2, 50000 ,2452,1));
		map.put("张20", new User("张20","131026197708092331",1,"13310890137",1,1,2,1,"李20","13522371229","test30@126.com",1, 50000 ,9928,1));
		map.put("张21", new User("张21","131026197708092331",2,"13310890138",2,1,2,2,"李21","13522371230","test30@126.com",1, 50000 ,2322,1));
		map.put("张22", new User("张22","131026197708092331",0,"13310890138",0,1,2,0,"李22","13522371231","test30@126.com",1, 50000 ,2522,1));
		map.put("张23", new User("张23","131026197708092331",1,"13310890138",1,1,2,1,"李23","13522371232","test30@126.com",1, 50000 ,2722,1));
		map.put("张24", new User("张24","131026197708092331",1,"13310890138",2,1,2,2,"李24","13522371233","test30@126.com",1, 50000 ,2922,1));
		map.put("张25", new User("张25","131026197708092331",2,"13310890138",0,1,2,0,"李25","13522371234","test30@126.com",0, 50000 ,3122,1));
		map.put("张26", new User("张26","131026197708092331",1,"13310890138",1,1,1,1,"李26","13522371235","test30@126.com",0, 50000 ,3322,1));
		map.put("张27", new User("张27","131026197708092331",1,"13310890138",2,1,1,2,"李27","13522371236","test30@126.com",0, 50000 ,3522,1));
		map.put("张281", new User("张281","131026197708092331",2,"13310890139",0,1,1,0,"李28","13522371237","test30@126.com",0, 50000 ,3722,1));
		map.put("张282", new User("张282","131026197708092331",2,"13310890139",0,1,1,0,"李28","13522371237","test30@126.com",0, 50000 ,3922,1));
		map.put("张283", new User("张283","131026197708092331",2,"13310890139",0,0,1,0,"李28","13522371237","test30@126.com",0, 50000 ,4122,1));
		map.put("张384", new User("张284","131026197708092331",2,"13310890139",0,0,1,0,"李28","13522371237","test30@126.com",0, 50000 ,4322,1));
		map.put("张30", new User("张30","131026197708092331",1,"13310890141",0,2,1,1,"李30","13522371239","test30@126.com",1, 107947 ,9928,1));
		map.put("张31", new User("张31","131026197708092331",1,"13310890142",0,2,0,1,"李31","13522371240","test31@126.com",0, 219840 ,4318,1));
		map.put("张32", new User("张32","131026197708092331",2,"13310890143",0,1,0,1,"李32","13522371241","test32@126.com",0, 192167 ,4604,1));
		map.put("张33", new User("张33","131026197708092331",1,"13310890144",0,0,2,1,"李33","13522371242","test33@126.com",0, 140135 ,3865,1));
		map.put("张34", new User("张34","131026197708092331",1,"13310890145",2,0,0,1,"李34","13522371243","test34@126.com",0, 155929 ,4043,1));
		map.put("张35", new User("张35","131026197708092331",0,"13310890146",2,0,2,0,"李35","13522371244","test35@126.com",2, 156761 ,421,1));
		map.put("张36", new User("张36","131026197708092331",1,"13310890147",1,0,2,2,"李36","13522371245","test36@126.com",1, 121521 ,9598,1));
		map.put("张37", new User("张37","131026197708092331",1,"13310890148",2,0,2,1,"李37","13522371246","test37@126.com",2, 211417 ,3529,1));
		map.put("张38", new User("张38","131026197708092331",2,"13310890149",0,0,1,1,"李38","13522371247","test38@126.com",1, 270712 ,4581,1));
		map.put("张39", new User("张39","131026197708092331",1,"13310890150",1,0,2,2,"李39","13522371248","test39@126.com",0, 51332 ,5393,1));
		map.put("张40", new User("张40","131026197708092331",1,"13310890151",1,1,2,0,"李40","13522371249","test40@126.com",1, 80520 ,5547,1));
		map.put("张41", new User("张41","131026197708092331",1,"13310890152",1,0,1,2,"李41","13522371250","test41@126.com",2, 207800 ,8159,1));
		map.put("张42", new User("张42","131026197708092331",1,"13310890153",0,1,2,0,"李42","13522371251","test42@126.com",1, 289777 ,1700,1));
		map.put("张43", new User("张43","131026197708092331",1,"13310890154",0,1,0,2,"李43","13522371252","test43@126.com",2, 294674 ,1214,1));
		map.put("张44", new User("张44","131026197708092331",1,"13310890155",2,2,1,2,"李44","13522371253","test44@126.com",1, 244585 ,644,1));
		map.put("张45", new User("张45","131026197708092331",1,"13310890156",1,1,1,0,"李45","13522371254","test45@126.com",1, 287712 ,6322,1));
		map.put("张46", new User("张46","131026197708092331",1,"13310890157",0,1,2,1,"李46","13522371255","test46@126.com",1, 273028 ,8744,1));
		map.put("张47", new User("张47","131026197708092331",1,"13310890158",0,1,2,2,"李47","13522371256","test47@126.com",0, 230224 ,1174,1));
		map.put("张48", new User("张48","131026197708092331",1,"13310890159",0,2,2,2,"李48","13522371257","test48@126.com",0, 165271 ,6473,1));
		map.put("张49", new User("张49","131026197708092331",1,"13310890160",2,2,0,2,"李49","13522371258","test49@126.com",2, 114367 ,7963,1));
		return map.get(id);
	}
	public static Business getBusiness(String key){
		Map<String, Business> map = new HashMap<String, Business>();
		map.put("张", new Business("张","4201021997080981234","xxxxx",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508121,"13310890120",0,100764,0.419007905,8397,2878.971429,1919.314286,2));
		map.put("张2", new Business("张2",null,"xx1xx,10freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508122,"13310890121",1,74952,0.156913446,6246,2141.485714,1427.657143,0));
		map.put("张3", new Business("张3","4201021977080981234","xx1xx,11freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508123,"0",2,44580,0.728518913,3715,1273.714286,849.1428571,0));
		map.put("张4", new Business("张4","420102167080981234","xx1xx,12freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508124,"13310890211",3,74280,0.290271402,6190,2122.285714,1414.857143,0));
		map.put("张6", new Business("张6","4201021987080981234","xx1xx,14freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508125,"1331089021",5,71856,0.826868163,5988,2053.028571,1368.685714,0));
		map.put("张7", new Business("张7","4201021957080981234","xx1xx,15freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508126,"13310890124",6,21060,0.607051932,1755,601.7142857,401.1428571,2));
		map.put("张8", new Business("张8","4201021957080983234","xx1xx,16freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508127,"13310890125",7,23724,0.416980106,1977,677.8285714,451.8857143,2));
		map.put("张9", new Business("张9","4201021964080983234","xx1xx,17freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508128,"13310890126",8,44520,0.329010953,3710,1272.000000,848.000000,1));
		map.put("张10", new Business("张10","4201021978080983234","xx1xx,18freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508129,"13310890127",9,23952,0.243460879,1996,684.3428571,456.2285714,2));
		map.put("张11", new Business("张11","4201021970080983234","xx1xx,19freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508130,"13310890128",0,49332,0.098075479,4111,1409.485714,939.6571429,1));
		map.put("张12", new Business("张12","4201021971080983234","xx1xx,20freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508131,"13310890129",15,42840,0.536862059,3570,1224.000000,816.000000,0));
		map.put("张13", new Business("张13","GB21957080981234","xx1xx,21freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508132,"13310890130",16,21060,0.607051932,1755,601.7142857,401.1428571,2));
		map.put("张14", new Business("张14","4201021972080983234","xx1xx,22freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508133,"13310890131",17,23724,0.416980106,1977,677.8285714,451.8857143,2));
		map.put("张15", new Business("张15","4201021973080983234","xx1xx,23freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508134,"13310890132",22,44520,0.329010953,3710,1272.000000,848.000000,1));
		map.put("张17", new Business("张17","4201021975080983234","xx1xx,25freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508135,"13310890134",6,23952,0.243460879,1996,684.3428571,456.2285714,2));
		map.put("张18", new Business("张18","4201021976080983234","xx1xx,26freed.rd",DateUtils.StringToDate("2015/8/19", "yyyy/MM/dd"),201508136,"13310890135",37,21060,0.607051932,1755,601.7142857,401.1428571,2));
		map.put("张19", new Business("张19","4201021997080982234","xx1xx,27freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508137,"13310890136",42,23724,0.416980106,1977,677.8285714,451.8857143,2));
		map.put("张20", new Business("张20","4201021980080982234","xx1xx,28freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508132,"18577829032",47,44520,0.329010953,3710,1272.000000,848.000000,1));
		map.put("张21", new Business("张21","4201021982080982234","xx1xx,29freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508133,"13310890138",52,23952,0.243460879,1996,684.3428571,456.2285714,2));
		map.put("张22", new Business("张22","4201021981080182234","xx1xx,30freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508134,"13310890138",57,100764,0.419007905,8397,2878.971429,1919.314286,2));
		map.put("张23", new Business("张23","4201021981080282234","xx1xx,31freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508135,"13310890138",110,74952,0.156913446,6246,2141.485714,1427.657143,0));
		map.put("张24", new Business("张24","4201021981080382234","xx1xx,32freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508136,"13310890138",115,44580,0.728518913,3715,1273.714286,849.1428571,0));
		map.put("张25", new Business("张25","4201021981080482234","xx1xx,33freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508137,"13310890138",120,74280,0.290271402,6190,2122.285714,1414.857143,0));
		map.put("张26", new Business("张26","4201021981080582234","xx1xx,34freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508138,"13310890138",125,71856,0.826868163,5988,2053.028571,1368.685714,0));
		map.put("张27", new Business("张27","4201021981080682234","xx1xx,35freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508139,"13310890138",130,21060,0.607051932,1755,601.7142857,401.1428571,2));
		map.put("张28", new Business("张28","4201021981080782234","xx1xx,36freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508140,"13310890139",135,23724,0.416980106,1977,677.8285714,451.8857143,2));
		map.put("张28", new Business("张28","4201021981080782234","xx1xx,36freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508141,"13310890139",135,44520,0.329010953,3710,1272.000000,848.000000,1));
		map.put("张28", new Business("张28","4201021981080782234","xx1xx,36freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508142,"13310890139",135,44520,0.329010953,3710,1272.000000,848.000000,1));
		map.put("张28", new Business("张28","4201021981080782234","xx1xx,36freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),201508143,"13310890139",135,44520,0.329010953,3710,1272.000000,848.000000,1));
		map.put("张30", new Business("张30","4201021967080982234","xx1xx,38freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081130,"13310890141",145,99564,0.327085249,8297,686.6482759,457.7655172,2));
		map.put("张31", new Business("张31","4201021964081082234","xx1xx,39freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081131,"13310890142",150,92520,0.950910324,7710,616.8,411.2,2));
		map.put("张32", new Business("张32","4201021964081182234","xx1xx,40freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081132,"13310890143",155,11520,0.306915309,960,74.32258065,49.5483871,1));
		map.put("张33", new Business("张33","4201021958081282234","xx1xx,41freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081133,"13310890144",40,88152,0.762252134,7346,3.8,1469.2,0));
		map.put("张34", new Business("张34","4201021961081382234","xx1xx,42freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081134,"13310890145",35,100764,0.419007905,8397,2878.971429,1919.314286,2));
		map.put("张35", new Business("张35","4201021962081482234","xx1xx,43freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081135,"13310890146",35,74952,0.156913446,6246,2141.485714,1427.657143,0));
		map.put("张36", new Business("张36","4201021984081582234","xx1xx,44freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081136,"13310890147",35,44580,0.728518913,3715,1273.714286,849.1428571,0));
		map.put("张37", new Business("张37","4201021956081682234","xx1xx,45freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081137,"13310890148",35,74280,0.290271402,6190,2122.285714,1414.857143,0));
		map.put("张38", new Business("张38","4201021995081782234","xx1xx,46freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081138,"13310890149",35,71856,0.826868163,5988,2053.028571,1368.685714,0));
		map.put("张39", new Business("张39","4201021975081882234","xx1xx,47freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081139,"13310890150",35,21060,0.607051932,1755,601.7142857,401.1428571,2));
		map.put("张40", new Business("张40","4201021974081982234","xx1xx,48freed.rd",DateUtils.StringToDate("2015/1/1", "yyyy/MM/dd"),2015081140,"13310890151",35,23724,0.416980106,1977,677.8285714,451.8857143,2));
		map.put("张41", new Business("张41","4201021994082082234","xx1xx,49freed.rd",DateUtils.StringToDate("2015/1/2", "yyyy/MM/dd"),2015081141,"13310890152",35,44520,0.329010953,3710,1272.000000,848.000000,1));
		map.put("张42", new Business("张42","4201021957082182234","xx1xx,50freed.rd",DateUtils.StringToDate("2015/1/3", "yyyy/MM/dd"),2015081142,"13310890153",35,23952,0.243460879,1996,684.3428571,456.2285714,2));
		map.put("张43", new Business("张43","4201021964082282234","xx1xx,51freed.rd",DateUtils.StringToDate("2015/1/4", "yyyy/MM/dd"),2015081143,"13310890154",35,49332,0.098075479,4111,1409.485714,939.6571429,1));
		map.put("张44", new Business("张44","4201021996082382234","xx1xx,52freed.rd",DateUtils.StringToDate("2015/1/5", "yyyy/MM/dd"),2015081144,"13310890155",35,42840,0.536862059,3570,1224.000000,816.000000,0));
		map.put("张45", new Business("张45","4201021970082482234","xx1xx,53freed.rd",DateUtils.StringToDate("2015/1/6", "yyyy/MM/dd"),2015081145,"13310890156",35,54720,0.264008652,4560,1563.428571,1042.285714,2));
		map.put("张46", new Business("张46","4201021986082582234","xx1xx,54freed.rd",DateUtils.StringToDate("2015/1/7", "yyyy/MM/dd"),2015081146,"13310890157",35,11556,0.901279264,963,330.1714286,220.1142857,2));
		map.put("张47", new Business("张47","4201021976082682234","xx1xx,55freed.rd",DateUtils.StringToDate("2015/1/8", "yyyy/MM/dd"),2015081147,"13310890158",35,88248,0.098351721,7354,2521.371429,1680.914286,2));
		map.put("张48", new Business("张48","4201021984082782234","xx1xx,56freed.rd",DateUtils.StringToDate("2015/1/8", "yyyy/MM/dd"),2015081148,"13310890159",35,108144,0.540559536,9012,3089.828571,2059.885714,1));
		map.put("张49", new Business("张49","4201021977082882234","xx1xx,57freed.rd",DateUtils.StringToDate("2015/1/8", "yyyy/MM/dd"),2015081149,"13310890160",35,1032,0.457223293,86,29.48571429,19.65714286,1));
		return map.get(key);
	}
}
