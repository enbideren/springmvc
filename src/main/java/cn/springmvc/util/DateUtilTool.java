package cn.springmvc.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class DateUtilTool {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
    private static Log log = LogFactory.getLog(DateUtilTool.class);

    public static Timestamp dateToTimestamp(Date date) {
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String dateStr = format.format(date);
	Timestamp timeStamp = Timestamp.valueOf(dateStr);
	return timeStamp;
    }

    public static Timestamp toTimestamp(String paramValue) {
	String pattern;
	if (paramValue.length() == 10) {
	    pattern = "yyyy-MM-dd";
	} else if (paramValue.length() == 19) {
	    pattern = "yyyy-MM-dd HH:mm:ss";
	} else if (paramValue.length() == 16) {
	    pattern = "yyyy-MM-dd HH:mm";
	} else if (paramValue.length() == 7) {
	    pattern = "yyyy-MM";
	} else {
	    return null;
	}
	SimpleDateFormat format = new SimpleDateFormat(pattern);
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	try {
	    Date date = format.parse(paramValue);
	    String time = format1.format(date);
	    return Timestamp.valueOf(time);
	} catch (ParseException e) {
	    log.error("", e);
	    return null;
	}
    }

    public static Date toDate(String paramValue) {
	String pattern;
	if (paramValue.length() == 10) {
	    pattern = "yyyy-MM-dd";
	} else if (paramValue.length() == 19) {
	    pattern = "yyyy-MM-dd HH:mm:ss";
	} else if (paramValue.length() == 16) {
	    pattern = "yyyy-MM-dd HH:mm";
	} else if (paramValue.length() == 7) {
	    pattern = "yyyy-MM";
	} else if (paramValue.length() == 8) {
	    pattern = "yyyyMMdd";
	} else {
	    return null;
	}
	SimpleDateFormat format = new SimpleDateFormat(pattern);
	try {
	    return format.parse(paramValue);
	} catch (ParseException e) {
	    log.error("", e);
	    return null;
	}
    }
    
    /**
	 * 将短时间格式字符串转换为时间 yyyy-MM-dd
	 * 
	 * @param date
	 *            要转换的日期
	 * @return 转换后的日期字符串
	 * @see
	 */
	public static String dateToStr(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
			log.error("日期格式转换失败", e);
			return null;
		}
	}
	public static String dateToStr1(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
			log.error("日期格式转换失败", e);
			return null;
		}
	}
    
	public static String dateToStr2(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
			log.error("日期格式转换失败", e);
			return null;
		}
	}
	
	public static String dateToStr3(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
			log.error("日期格式转换失败", e);
			return null;
		}
	}
	public static String dateToStr4(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
			log.error("日期格式转换失败", e);
			return null;
		}
	}
	public static String dateToStr5(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd");
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
			log.error("日期格式转换失败", e);
			return null;
		}
	}
	public static String dateToStr6(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMM");
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
			log.error("日期格式转换失败", e);
			return null;
		}
	}
    /**
     * 给指定日期添加或减去指定天
     * 
     * @param date
     * @param amount
     * @return
     */
    public static Date addDay(Date date, int amount) {
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(Calendar.DATE, amount);
	return calendar.getTime();
    }
    
    
    /**
     * @description 返回某天的零点零分零秒，为0时为当前date，为正数时为当前date的后N天，为负数时为前N天
     */
    public static Date getOffsetDate000000(Date date,int offsetDate) {
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(date);
    	cal.set(Calendar.HOUR_OF_DAY, 0);
    	cal.set(Calendar.MINUTE, 0);
    	cal.set(Calendar.SECOND, 0);
    	cal.set(Calendar.MILLISECOND, 0);
		if (offsetDate != 0) {
			cal.add(Calendar.DATE,offsetDate);
		}
		return cal.getTime();
    }
    
    /**
     * 返回系统当前月的第一天的日期
     * @return
     */
    public static String getFirstDay(){
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
    	Calendar c = Calendar.getInstance();    
    	c.add(Calendar.MONTH, 0);
    	c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
    	String firstDay = format.format(c.getTime());
    	return firstDay;
    }
    /**取得两个日期间的天数*/
	 public static long dateDiff(String time1, String time2){
		  long quot = 0;
		  SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		  try {
		   Date date1 = ft.parse( time1 );
		   Date date2 = ft.parse( time2 );
		   quot = date1.getTime() - date2.getTime();
		   quot = quot / 1000 / 60 / 60 / 24;
		  } catch (ParseException e) {
		   e.printStackTrace();
		  }
		  return quot;
		 }
}
