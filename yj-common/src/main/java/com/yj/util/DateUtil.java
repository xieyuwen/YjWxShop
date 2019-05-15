package com.yj.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @项目名：公司内部模板项目
 * @作者：zhou.ning
 * @描述：日期工具类
 * @日期：Created in 2018/6/8 15:05
 */
public class DateUtil {
	
	private static final SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final SimpleDateFormat sdf_date=new SimpleDateFormat("yyyy-MM-dd");
	private static final SimpleDateFormat sdf_date_currentTime=new SimpleDateFormat("yyyyMMddHHmmss");

	/**
	 * 获取当前时间 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getCurrentTime4Str(){
		return sdf.format(Calendar.getInstance().getTime());
	}
	
	
	public static String getThisDate(Date date) {
		
		return sdf_date.format(date);
	}
	
	public static String getThisHours(Date date) {
		 SimpleDateFormat sdf_hour=new SimpleDateFormat("HH:mm");
		 return sdf_hour.format(date);
	}
	
	
	/**
	 * 获取当前时间毫秒值
	 * @return
	 */
	public static String getcurrentTimeMillis(){
		return System.currentTimeMillis()+"";
	}
    /**
     * 获取当前时间秒数
     * @return
     */
    public static String getcurrentSecondsString(){
        long currentTimeMillis = System.currentTimeMillis();
        long l = currentTimeMillis/1000;
        String ls = Long.toString(l);
        return ls;
	}
	/**
	 * 获取当前时间秒数
	 * @return  int
	 */
	public static Integer getCurrentSecondsInt(){
		long currentTimeMillis = System.currentTimeMillis();
		long l = currentTimeMillis/1000;
		int i = Integer.parseInt(l + "");
		return i;
	}
	/**
	 * 将字符串时间转换为秒值
	 * @return
	 */
	public static long formateConverLong(String fmt){

		try {
			Date parse = sdf.parse(fmt);
			long l = parse.getTime()/1000;
			return  l;

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return  0;
	}

	/**
	 * 将时间  yyyy-MM-dd HH:mm:ss 转为Date
	 * @param time
	 * @return
	 */
	public static Date formatyyyyMMddHHmmss(String time){
		try {
			Date parse = sdf.parse(time);
			return  parse;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return  null;
	}

	/**
	 * 将时间   毫秒值  转换为 yyyy-MM-dd HH:mm:ss
	 * @param time
	 * @return
	 */
	public static String formatTimeMillis(String time){
			String format = sdf.format(Long.parseLong(time));
			return format;
	}

	/**
	 * 获取当前时间 yyyy--mmdd
	 * @return
	 */
	public static String getCurrentyyyymmdd(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(Calendar.getInstance().getTime());
	}
	/**
	 * 获取当前时间  yyyy-MM-dd
	 * @return
	 */
	public static String getCurrentyyyyMMdd(){
		return sdf_date.format(Calendar.getInstance().getTime());
	}
	
	/**
	 * 获取当前时间 yyyymmddHHmmss
	 * @return
	 */
	public static String getCurrentyyyymmddHHmmss(){
		return sdf_date_currentTime.format(Calendar.getInstance().getTime());
	}
	/**
	 * 获取当前时间 yyyymmddHHmmss
	 * @return
	 */
	public static String formatyyyyMMddHHmmss(Date date){
		return sdf.format(date);
	}

    public static Date parseDate(String dateStr, String fmt) throws ParseException {
		return new SimpleDateFormat(fmt).parse(dateStr);
    }
    public static String format(Date date,String fmt){
		return new SimpleDateFormat(fmt).format(date);
	}
	/**
	 * cyj
	 * 给日期添加指定分钟数
	 * @param date
	 * @param num
	 * @return
	 */
	public static Date DateAddMinute(Date date,Integer num){
//        Format f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MINUTE, num);// 今天+N分钟
		Date tomorrow = c.getTime();
		return tomorrow;
	}
	/**
	 * cyj
	 * 给日期添加指定秒数
	 * @param date
	 * @param num
	 * @return
	 */
	public static Date DateAddSecond(Date date,Integer num){
//        Format f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.SECOND, num);// 今天+n秒
		Date tomorrow = c.getTime();
		return tomorrow;
	}
	/**
	 * cyj
	 * 给日期添加指定天数
	 * @param date
	 * @param num
	 * @return
	 */
	public static Date DateAddDays(Date date,Integer num){
//        Format f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, num);// 今天+N天
		Date tomorrow = c.getTime();
		return tomorrow;
	}

	/**
	 * cyj
	 * 给时间添加指定月数
	 * @param date
	 * @param num
	 * @return
	 */
	public static Date DateAddMonth(Date date,Integer num){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, num);// 今天+N天
		Date tomorrow = c.getTime();
		return tomorrow;
	}

	/**
	 * cyj
	 * 判断时间是否为同一天
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean ifEqDate(Date date1,Date date2){
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		return fmt.format(date1).equals(fmt.format(date2));
	}

	/**
	 * cyj
	 * 获取当天的开始时间
	 * @return
	 */
	public static Date getDayBegin() {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * cyj
	 * 获取当天的结束时间
	 * @return
	 */
	public static Date getDayEnd() {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		return cal.getTime();
	}
	
	/**
     * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
     * 
     * @param nowTime 当前时间
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     * @author jqlin
     */
    public static boolean isEffectiveDate(Date startTime, Date endTime) {
    	Date nowTime = new Date();
    	if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }
	
	public static void main(String[] args) {
		System.out.println(DateAddMonth(new Date(), 1));
	}
}
