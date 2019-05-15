package com.yj.util;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @项目名：昭通
 * @类名称：${CLASS_NAME}
 * @类描述：MD5工具类
 * @创建人：john
 * @时间：2018年01月04日 17:11
 */
public class MD5Util {

    public static String EncoderByMd5(String str){
        String newStr = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64Encoder = new BASE64Encoder();
            newStr = base64Encoder.encode(md5.digest(str.getBytes("utf-8")));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return  newStr;
    }

    public static  String createPassword(String pwd, String salt){
        pwd = pwd.substring(0,3) + salt + pwd.substring(1,pwd.length());
        pwd = MD5Util.EncoderByMd5(pwd);
        return  pwd;
    }
    
    
    /**
	 * 
	 * @param plainText
	 *            明文
	 * @return 32位密文
	 */
	public static String encryption(String plainText) {
		String re_md5 = new String();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();

			int i;

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}

			re_md5 = buf.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return re_md5;
	}
}
