package com.yj.util;

import java.security.MessageDigest;
import java.util.Arrays;



public class WxCheckUtil {
	//private static final Logger log = LoggerFactory.getLogger(WxCheckUtil.class);
	
	//微信认证接口对接
	public static final String token = "xywShop";
	public static boolean wxCheckUtil(String signature,String timestamp,String nonce,String echostr){
		/*log.debug("=======================================1--"+signature);
		log.debug("=======================================2--"+timestamp);
		log.debug("=======================================3---"+nonce);*/
		
		String [] arry = new String[]{token,timestamp,nonce};
		Arrays.sort(arry);
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0; i < arry.length; i++){
			stringBuffer.append(arry[i]);
		}
		String tempSignature = getSha1(stringBuffer.toString());
	//	log.debug("=======================================4----"+tempSignature);
		return tempSignature.equals(signature);
	}
	
	 public static String getSha1(String str){
	        if(str==null||str.length()==0){
	            return null;
	        }
	        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9',
	                'a','b','c','d','e','f'};
	        try {
	            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
	            mdTemp.update(str.getBytes("UTF-8"));

	            byte[] md = mdTemp.digest();
	            int j = md.length;
	            char buf[] = new char[j*2];
	            int k = 0;
	            for (int i = 0; i < j; i++) {
	                byte byte0 = md[i];
	                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
	                buf[k++] = hexDigits[byte0 & 0xf];
	            }
	            return new String(buf);
	        } catch (Exception e) {
	            return null;
	        }
	    }
}
