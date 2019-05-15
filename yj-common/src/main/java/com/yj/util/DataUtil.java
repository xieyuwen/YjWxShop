package com.yj.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DataUtil {

	private final static DecimalFormat df = new DecimalFormat("#.00");
	
	
	/*****
	 * 
	     * @方法名：decimalFormat
	     * @描述： 将double转化为String保留两位小数
	     * @作者： lijing
	     * @日期： 2019年1月14日
	 */
	public static String decimalFormat(double b) {
		
		return df.format(b);
	}
	
	/****
	 * 
	     * @方法名：setScale
	     * @描述：  将double保留两位小数
	     * @作者： lijing
	     * @日期： 2019年1月14日
	 */
	public static Double setScale(double d) {
		BigDecimal b = new BigDecimal(d);
		d = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
		return d;
	}
	
	/***
	 * 
	     * @方法名：alphabeticalOrder
	     * @描述： 字母排序
	     * @作者： lijing
	     * @日期： 2019年3月22日
	 */
	public static String alphabeticalOrder(String str) {
		String s = "";
		List<String> list = new ArrayList<String>();
		if(str !=null && !"".equals(str)) {
			str= str.toUpperCase();
			for(int i=0;i<str.toCharArray().length;i++) {
				list.add(String.valueOf(str.toCharArray()[i]));
			}
		}
		Collections.sort(list);	
		for(String sg:list) {
			if(sg !=null && !"".equals(sg)) {
				s+=sg;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		
		String s = "bcafhfhfhfhgf";
		System.out.println(alphabeticalOrder(s));
		
		
		System.out.println(alphabeticalOrder("cba").equals("ABC"));
		
	}

	
}
