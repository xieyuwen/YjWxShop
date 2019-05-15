package com.yj.util;

import java.net.URL;

/**
 * 作者：Li.Wei
 * 时间：2018/8/10 9:48
 * 描述：
 */
public class StringUtil {
    private StringUtil() {

    }
    /**
     * "file:/home/whf/cn/fh" -> "/home/whf/cn/fh"
     * "jar:file:/home/whf/foo.jar!cn/fh" -> "/home/whf/foo.jar"
     */
    public static String getRootPath(URL url) {
        String fileUrl = url.getFile();
        int pos = fileUrl.indexOf('!');

        if (-1 == pos) {
            return fileUrl;
        }

        return fileUrl.substring(5, pos);
    }

    /**
     * "cn.fh.lightning" -> "cn/fh/lightning"
     * @param name
     * @return
     */
    public static String dotToSplash(String name) {
        return name.replaceAll("\\.", "/");
    }

    /**
     * "Apple.class" -> "Apple"
     */
    public static String trimExtension(String name) {
        int pos = name.indexOf('.');
        if (-1 != pos) {
            return name.substring(0, pos);
        }

        return name;
    }

    /**
     * /application/home -> /home
     * @param uri
     * @return
     */
    public static String trimURI(String uri) {
        String trimmed = uri.substring(1);
        int splashIndex = trimmed.indexOf('/');

        return trimmed.substring(splashIndex);
    }
    
    /**
     * 判断字符串是否为空
     * @param str 待验证的字符串
     * @return true 为空  false 不为空
     */
    public static boolean isNotEmpty( String str ){
        return (str != null && !str.isEmpty());
    }
    
    public static boolean isEmpty(Object str) {
        return (str == null || str.toString().isEmpty() || "null".equalsIgnoreCase(str.toString()));
    }
}
