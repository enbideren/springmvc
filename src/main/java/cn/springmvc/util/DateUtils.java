package cn.springmvc.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.util.StringUtils;

public class DateUtils {
	public static final int PERIOD_TYPE_YEAR = 0;
	public static final int PERIOD_TYPE_MONTH = 1;
	public static final int PERIOD_TYPE_HALFMONTH = 2;
	public static final int PERIOD_TYPE_WEEK = 3;

	public static String[] getAllMonths(String start, String end){
		String splitSign="-";
		String regex="\\d{4}"+splitSign+"(([0][1-9])|([1][012]))"; //判断YYYY-MM时间格式的正则表达式
		if(!start.matches(regex) || !end.matches(regex)) return new String[0];

		List<String> list=new ArrayList<String>();
		if(start.compareTo(end)>0){
			//start大于end日期时，互换
			String temp=start;
			start=end;
			end=temp;
		}

		String temp=start; //从最小月份开始
		while(temp.compareTo(start)>=0 && temp.compareTo(end)<=0){
			list.add(temp); //首先加上最小月份,接着计算下一个月份
			String[] arr=temp.split(splitSign);
			int year=Integer.valueOf(arr[0]);
			int month=Integer.valueOf(arr[1])+1;
			if(month>12){
				month=1;
				year++;
			}
			if(month<10){//补0操作
				temp=year+splitSign+"0"+month;
			}else{
				temp=year+splitSign+month;
			}
		}

		int size=list.size();
		String[] result=new String[size]; 
		for(int i=0;i<size;i++){
			result[i]=list.get(i);
		}
		return result;
	}

	/*
	 * 输出前几个月的信息，包括当前月
	 * */
	public static List<String> getMonth(int num){
		List<String> objectTmp = new ArrayList<String>();
		java.text.DateFormat format2 = new java.text.SimpleDateFormat(
				"yyyy/MM");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 1);
		for (int i = 0; i < num; i++) {
			c.add(Calendar.MONTH, -1);
			Date date = c.getTime();
			String date2 = format2.format(date);
			//System.out.println(date2);
			objectTmp.add(date2);
		}
		return objectTmp;
	}
	
	/*
	 * 输出前几个月的信息，包括当前月,format可以是yyyy/MM
	 * */
	public static List<String> getMonths(int num,String format){
		List<String> objectTmp = new ArrayList<String>();
		java.text.DateFormat format2 = new java.text.SimpleDateFormat(
				format);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 1);
		for (int i = 0; i < num; i++) {
			c.add(Calendar.MONTH, -1);
			Date date = c.getTime();
			String date2 = format2.format(date);
			//System.out.println(date2);
			objectTmp.add(date2);
		}
		return objectTmp;
	}
	
	/*
	 * 输出前几个月的信息，不包括当前月,format可以是yyyy/MM
	 * */
	public static List<String> getMonthsNotInclude(int num,String format){
		List<String> objectTmp = new ArrayList<String>();
		java.text.DateFormat format2 = new java.text.SimpleDateFormat(
				format);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 0);
		for (int i = 0; i < num; i++) {
			c.add(Calendar.MONTH, -1);
			Date date = c.getTime();
			String date2 = format2.format(date);
			//System.out.println(date2);
			objectTmp.add(date2);
		}
		return objectTmp;
	}
	
	/**
	 * 计算过去某天距今天多少天
	 * @author JZR	
	 * @param 
	 * @return
	 */
	public static int dayDist(String dateStr) throws Exception{
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date date=df.parse(dateStr);
		return dayDist(date);
	}
	/*
	 * 计算过去某天距今天多少天
	 * */
	public static int dayDist(Date date) throws Exception{
		long timeMillion=new Date().getTime()-date.getTime();
		return (int)(timeMillion/(24l*60*60*1000));
	}
	/*
	 * 计算上个月的今天
	 * */
	public static String getLMDay(){
		java.text.DateFormat format2 = new java.text.SimpleDateFormat(
				"yyyy-MM-dd");
		Calendar c = Calendar.getInstance();

		c.add(Calendar.MONTH, -1);
		Date date = c.getTime();
		String date2 = format2.format(date);

		return date2;
	}
	/*
	 * 计算去年的今天
	 * */
	public static String getLYDay(){
		java.text.DateFormat format2 = new java.text.SimpleDateFormat(
				"yyyy-MM-dd");
		Calendar c = Calendar.getInstance();

		c.add(Calendar.YEAR, -1);
		Date date = c.getTime();
		String date2 = format2.format(date);
		return date2;
	}
	/*
	 * 计算N月前的今天
	 * */
	public static String getLMDay(int n){
		java.text.DateFormat format2 = new java.text.SimpleDateFormat(
				"yyyy-MM-dd");
		Calendar c = Calendar.getInstance();

		c.add(Calendar.MONTH, -n);
		Date date = c.getTime();
		String date2 = format2.format(date);

		return date2;
	}

	/*
	 * 计算今天到过去某一天的总共天数
	 * */
	public static int caculateDays (Date compareDay) {
		Date today=new Date();
		long todayMilliseconds=today.getTime();

		long compareMilliseconds=compareDay.getTime();
		//获得两个日期之间的毫秒差。
		long differenceMilliseconds=todayMilliseconds-compareMilliseconds;
		//一天的毫秒数
		long oneDayMilliseconds=24*60*60*1000;
		//除以一天的毫秒数，就是相差的天数。
		int result=(int)(differenceMilliseconds/oneDayMilliseconds);
		return result;
	}

	/*
	 *按照格式输出之前每个月的信息
	 * */
	public static List<String> getMonthForm(int num,String type){
		List<String> objectTmp = new ArrayList<String>();
		java.text.DateFormat format2 = new java.text.SimpleDateFormat(
				type);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 1);
		for (int i = 0; i < num; i++) {
			c.add(Calendar.MONTH, -1);
			Date date = c.getTime();
			String date2 = format2.format(date);
			//System.out.println(date2);
			objectTmp.add(date2);
		}
		return objectTmp;
	}
	/**
	 * @param d
	 * @param format 默认 yyyy-MM-dd HH:mm:ss 可自定义
	 * @return
	 */
	public static String formatDate(Date d,String format){
		if(format==null||"".equals(format)){
			format = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(d);
	}
	/*
	 *String转Date
	 * */
	public static Date StringToDate(String dateStr, String formatStr) {
		DateFormat dd = new SimpleDateFormat(formatStr);
		Date date = null;
		if (!StringUtils.isEmpty(dateStr)) {
			try {
				date = dd.parse(dateStr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}

	/**
	 * 判断月份是否相等
	 * */
	public static Boolean isEqual(String month){
		Date d = new Date();
		String data = formatDate( d, "yyyyMM");
		Boolean flag = false;
		if(data.equals(month)){
			flag = true;
		}
		return flag;
	}
	public static Date add(Date date, int field, int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(field, amount);
		return cal.getTime();
	}

	public static Date[] getPeriodByType(Date currentDate, int type) {

		Date fromDate = currentDate;
		Date toDate = currentDate;
		Calendar cal;
		switch (type) {
		case PERIOD_TYPE_YEAR:

			cal = Calendar.getInstance();
			cal.setTime(currentDate);
			cal.set(Calendar.MONTH, 0);
			cal.set(Calendar.DATE, 1);

			fromDate = cal.getTime();

			cal.add(Calendar.YEAR, 1);
			toDate = add(cal.getTime(), Calendar.DATE, -1);
			break;

		case PERIOD_TYPE_MONTH:
			cal = Calendar.getInstance();
			cal.setTime(currentDate);
			cal.set(Calendar.DATE, 1);

			fromDate = cal.getTime();

			cal.add(Calendar.MONTH, 1);
			toDate = add(cal.getTime(), Calendar.DATE, -1);
			break;

		case PERIOD_TYPE_WEEK:
			int dayOfWeek = getWeekDay(currentDate);
			int seg = -1 * dayOfWeek;

			fromDate = add(currentDate, Calendar.DATE, seg);
			toDate = add(fromDate, Calendar.DATE, 6);

			break;

		case PERIOD_TYPE_HALFMONTH:
			int dayOfMonth = getDayOfMonth(currentDate);
			fromDate = add(currentDate, Calendar.DATE, -1 * dayOfMonth + 1);
			if (dayOfMonth > 15) {
				cal = Calendar.getInstance();
				cal.setTime(fromDate);
				cal.add(Calendar.MONTH, 1);
				toDate = add(cal.getTime(), Calendar.DATE, -1);
				fromDate = add(fromDate, Calendar.DATE, 15);

			} else {
				toDate = add(fromDate, Calendar.DATE, 14);
			}

			break;

		default:
			break;
		}

		Date[] period = new Date[2];
		period[0] = fromDate;
		period[1] = toDate;
		return period;
	}
	public static int getDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		return cal.get(Calendar.DAY_OF_MONTH);
	}

	public static int getWeekDay(Date date) {
		if (date == null) {
			return -1;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		return getWeekDay(calendar.get(Calendar.DAY_OF_WEEK));
	}
	public static int getWeekDay(int weekNumber) {
		switch (weekNumber) {
		case Calendar.MONDAY:
			return 1;

		case Calendar.TUESDAY:
			return 2;

		case Calendar.WEDNESDAY:
			return 3;

		case Calendar.THURSDAY:
			return 4;

		case Calendar.FRIDAY:
			return 5;

		case Calendar.SATURDAY:
			return 6;

		case Calendar.SUNDAY:
			return 0;

		default:
			return -1;
		}
	}
	/**返回几月前的日期字符串   如201408 前两个月就是201406
	 * @param d  日期
	 * @param format 返回格式
	 * @param month  几月前
	 * @return
	 */
	public static String getBeforeMonth(Date d,String format,int month){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -month);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(cal.getTime());
	}
	/**返回传入月份的天数   
	 * @param dateString  yyyyMM格式 例如 ：201409
	 * @return
	 */
	public static int getDaysOfMonth(String date){
		int days=0;
		try {
			Calendar rightNow = Calendar.getInstance();
			try {
			rightNow.setTime(DateUtils.StringToDate(date,"yyyyMM")); //要计算你想要的月份，改变这里即可
			} catch (Exception e) {
			e.printStackTrace();
			}
			days = rightNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		} catch (Exception e) {
		}
		return days;
	}
	
	
	public static String formatDateMouth(String m ){
		if(m!=null&&m.length()==2){
			String fix1 = m.substring(0, 1);
			String fix2 = m.substring(1, 2);
			if(fix1.equals("0")){
				return fix2;
			}
			return m;
		}
		return null;
	}
	
	 /**
	* <p>Title: lastDayOfMonth</p>
	* <p>Description: 根据输入的日期返回该月中的最后一天的日期</p>
	* @author Jerry Sun
	* @param d	
	* @return
	*/
	public static String lastDayOfMonth(String d) {
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM").parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     Calendar cal = Calendar.getInstance();
	     cal.setTime(date);
	     cal.set(Calendar.DAY_OF_MONTH, 1);
	     cal.roll(Calendar.DAY_OF_MONTH, -1);
	     Date time = cal.getTime();
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	     return sdf.format(time);
	 }
	/**
	 * @param inputFormat 例如 yyyy-MM
	 * @param outFormat   例如 yyyy-MM-dd
	* @return
	*/
	public static String lastDayOfMonth(String d,String inputFormat,String outFormat) {
		Date date = null;
		try {
			date = new SimpleDateFormat(inputFormat).parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     Calendar cal = Calendar.getInstance();
	     cal.setTime(date);
	     cal.set(Calendar.DAY_OF_MONTH, 1);
	     cal.roll(Calendar.DAY_OF_MONTH, -1);
	     Date time = cal.getTime();
	     SimpleDateFormat sdf = new SimpleDateFormat(outFormat);
	     return sdf.format(time);
	 }
	
	 /**
		* <p>Title: firstDayOfMonth</p>
		* <p>Description: 根据输入的日期返回该月中的第一天的日期</p>
		* @author Jerry Sun
		* @param d	
		* @return
		*/
		public static String firstDayOfMonth(String d) {
			Date date = null;
			try {
				date = new SimpleDateFormat("yyyy-MM").parse(d);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     Calendar cal = Calendar.getInstance();
		     cal.setTime(date);
		     cal.set(Calendar.DAY_OF_MONTH, 1);
		     Date time = cal.getTime();
		     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		     return sdf.format(time);
		 }
		
		/**
		* <p>Title: nextMonthFirstDay</p>
		* <p>Description: 获得指定日期的下一月的第一天</p>
		* @author Jerry Sun
		* @param d
		* @return
		*/
		public static String nextMonthFirstDay(String d){
			Date date = null;
			try {
				date = new SimpleDateFormat("yyyy-MM").parse(d);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     Calendar cal = Calendar.getInstance();
		     cal.setTime(date);
		     cal.add(Calendar.MONTH, 1);
		     Date time = cal.getTime();
		     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		     return sdf.format(time);
		}
		
		/**
		* <p>Title: nextMonthLastDay</p>
		* <p>Description: 获得指定日期的下一月的最后一天</p>
		* @author Jerry Sun
		* @param d
		* @return
		*/
		public static String nextMonthLastDay(String d){
			Date date = null;
			try {
				date = new SimpleDateFormat("yyyy-MM").parse(d);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     Calendar cal = Calendar.getInstance();
		     cal.setTime(date);
		     cal.add(Calendar.MONTH, 1);
		     cal.set(Calendar.DAY_OF_MONTH, 1);
		     cal.roll(Calendar.DAY_OF_MONTH, -1);
		     Date time = cal.getTime();
		     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		     return sdf.format(time);
		}
		
		/**
		* <p>Title: monthIsEqual</p>
		* <p>Description: 比较date1的月份是否大于date2</p>
		* @author Jerry Sun
		* @param date1
		* @param date2
		* @return
		*/
		public static boolean monthIsEqual(String date1, String date2){
			  String pattern ="yyyy-MM";
			  SimpleDateFormat sf = new SimpleDateFormat(pattern);
			  Date d1 = null,d2 = null;
			try {
				d1 = sf.parse(date1);
				d2 = sf.parse(date2);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			  if(d1.getTime() <= d2.getTime()){
			   return true;
			  }
			  return false;
		}
		
	/**
	 * @author jiangzongren
	* @param string	
	* @return float
	* <p>Title: transform</p>
	* <p>Description: 将HH:mm:ss格式的时间转化为秒</p>
	*/
	//将HH:mm:ss格式的时间转化为秒
	public static int transform(String time) {
		  String temp[] = time.split(":");
		 
		  int allSeconds=0;
		  if (temp.length==3) {
			  int hours = Integer.valueOf(temp[0]);
			  int minutes = Integer.valueOf(temp[1]);
			  int seconds = Integer.valueOf(temp[2]);
			  allSeconds = hours * 60 * 60 + minutes * 60 + seconds;
		  }else if (temp.length==2) {
			  int minutes = Integer.valueOf(temp[0]);
			  int seconds = Integer.valueOf(temp[1]);
			  allSeconds =  minutes * 60 + seconds;
		  }else if (temp.length==1) {
			  int seconds = Integer.valueOf(temp[0]);
			  allSeconds =  seconds;
		  }
		  //System.out.println("秒数：" + allSeconds);
		  return allSeconds;
		 }
	
	/**
	* <p>Title: getToday</p>
	* <p>Description: 获取今天的日期，并格式化为所指定的日期格式</p>
	* @author Jerry Sun
	* @param format 所需要得到的日期格式
	* @return
	*/
	public static String getToday(String format){
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String result = sdf.format(date);
		return result;
	}
	

	/**
	* <p>Title: isSameMonth</p>
	* <p>Description: 比较两个日期是否是相同年月</p>
	* @author Jerry Sun
	* @param date1
	* @param date2
	* @return
	*/
	public static boolean isSameMonth(String date1, String date2){
		return isSameMonth(date1,date2,null);
	}
	
	public static boolean isSameMonth(String date1, String date2,String format){
		String pattern ="yyyy-MM";
		if(format!=null){
			pattern=format;
		}
		 
		  SimpleDateFormat sf = new SimpleDateFormat(pattern);
		  Date d1 = null,d2 = null;
		try {
			d1 = sf.parse(date1);
			d2 = sf.parse(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		  if(d1.getTime() == d2.getTime()){
		   return true;
		  }
		  return false;
	}
	
	
	/**
	* <p>Title: strDateToStr</p>
	* <p>Description: 将Tue Oct 21 12:24:26 CST 2014格式的字符串日期转换为yyyyMMdd格式的字符串日期</p>
	* @author Jerry Sun
	* @param strDate 例：Tue Oct 21 12:24:26 CST 2014
	* @param fm 例：yyyyMMdd
	* @return
	*/
	public static String strDateToStr(String strDate, String fm){
		String result = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
			Date date = sdf.parse(strDate);
			
			SimpleDateFormat dd = new SimpleDateFormat(fm);
			result = dd.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/** 
	* @Title: getThisMonthMax 
	* @Description: 获取当前月最大日期
	* @author JerrySun
	* @date 2014年11月4日 下午4:03:49 
	* @param month
	* @return
	* @return Date 
	* @throws 
	*/
	public static Date getThisMonthMax(String month){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			cal.setTime(sdf.parse(month + "01"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cal.set(Calendar.MONTH, -1);
		Date thisMonthMax = cal.getTime();
		return thisMonthMax;
	}
	/**
	 * 根据当前时间-身份证的出生日期-18（年）-5（年）
	 * @author JZR	
	 * @param 
	 * @return
	 */
	public static Integer getWorkAge(String idCard){
		Integer result = null;
		try {
			int birthYear = Integer.parseInt(idCard.substring(6, 10));
			int currentYear = Integer.parseInt(DateUtils.formatDate(new Date(), "yyyy"));
			result = currentYear - birthYear - 18 - 5;
		} catch (Exception e) {
			//TODO 
			e.printStackTrace();
		}
		return result;
	}
	public static void main(String[] args) {
		//System.out.println(getDayOfMonth(new Date()));
		String s = "131026199210232331";
		System.out.println(s.substring(6, 10));
	}
}
