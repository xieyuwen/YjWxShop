package com.yj.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;
import com.yj.db.entity.AccessToken;
import com.yj.db.entity.ClickMenuButton;
import com.yj.db.entity.Menu;
import com.yj.db.entity.MenuButton;
import com.yj.db.entity.ViewMenuButton;

/*
 * 微信公众号工具类
 */
public class WxUtil {
	
	public static final String AppID = "wxb3d29e9ac5a90f89";//开发者ID是公众号开发识别码，配合开发者密码可调用公众号的接口能力
	
	public static final String AppSecret = "9a79e0d1505f6e493125807c8fea2fc6";//开发者密码是校验公众号开发者身份的密码，具有极高的安全性。切记勿把密码直接交给第三方开发者或直接存储在代码中。如需第三方代开发公众号，请使用授权方式接入。
	
	public static final String Access_Token_Url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";//AccessToken请求地址
	
	public static final String Menu_Url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";//菜单请求地址
	
	public static final String Delete_Menu_url = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";//删除菜单url
    /** 
     * 向指定URL发送GET方法的请求 
     *  
     * @param url 
     *            发送请求的URL 
     * @param param 
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。 
     * @return URL 所代表远程资源的响应结果 
     */  
    public static String sendGet(String url, String param) {  
        String result = "";  
        BufferedReader in = null;  
        try {  
            String urlNameString = url;  
            URL realUrl = new URL(urlNameString);  
            // 打开和URL之间的连接  
            URLConnection connection = realUrl.openConnection();  
            // 设置通用的请求属性  
            connection.setRequestProperty("accept", "*/*");  
            connection.setRequestProperty("connection", "Keep-Alive");  
            connection.setRequestProperty("user-agent",  
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");  
            // 建立实际的连接  
            connection.connect();  
            // 获取所有响应头字段  
            Map<String, List<String>> map = connection.getHeaderFields();  
            // 遍历所有的响应头字段  
           /*for (String key : map.keySet()) {  
                System.out.println(key + "--->" + map.get(key));  
            }*/  
            // 定义 BufferedReader输入流来读取URL的响应  
            in = new BufferedReader(new InputStreamReader(  
                    connection.getInputStream()));  
            String line;  
            while ((line = in.readLine()) != null) {  
                result += line;  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        // 使用finally块来关闭输入流  
        finally {  
            try {  
                if (in != null) {  
                    in.close();  
                }  
            } catch (Exception e2) {  
                e2.printStackTrace();  
            }  
        }  
        return result;  
    }
    
    /***
    *
    * @param url
    * @param param
    * @return 发送返回响应
    * @throws IOException
    */
   public static String sendInfoPost(String url,String param) throws IOException {

       CloseableHttpClient httpclient = HttpClients.createDefault();

       HttpPost httppost = new HttpPost(url);
       httppost.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");

       String textMsg = param;
       StringEntity se = new StringEntity(textMsg, "utf-8");
       httppost.setEntity(se);
       String result = null;
       org.apache.http.HttpResponse response = httpclient.execute(httppost);
       if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
           result= EntityUtils.toString(response.getEntity(), "utf-8");
       }else{
           result= EntityUtils.toString(response.getEntity(), "utf-8");
       }

       return result;
   }
   
   /*
    * 获取access_token
    */
   public static AccessToken getAccessToken(){
	   AccessToken accessToken = new AccessToken();
	   String url = Access_Token_Url.replace("APPID", AppID).replace("APPSECRET", AppSecret);
	   String tokeInfo = sendGet(url,"");
	   if(tokeInfo != null  && !"".equals(tokeInfo)){
		   JSONObject object  = JSONObject.parseObject(tokeInfo);
		   accessToken.setAccessToken(object.getString("access_token"));
		   accessToken.setExpiresIn(object.getString("expires_in"));
	   }
	   return accessToken;
   }
   
   /*
    * 生成自定义菜单
    */
   public static Menu getMenu(){
	   Menu menu = new Menu();
	   ViewMenuButton clickMenuButton1 = new ViewMenuButton();
	   clickMenuButton1.setName("商城福利");
	   clickMenuButton1.setType("view");
	   clickMenuButton1.setUrl("http://106.12.219.106/yj-shop-web/index.html");
	   ViewMenuButton clickMenuButton2 = new ViewMenuButton();
	   clickMenuButton2.setName("燕江科技");
	   clickMenuButton2.setType("view");
	   clickMenuButton2.setUrl("http://106.12.219.106/yj-shop-web/company.html");
	   ClickMenuButton clickMenuButton3 = new ClickMenuButton();
	   clickMenuButton3.setName("客户服务");
	   clickMenuButton3.setKey("custom_service");
	   ViewMenuButton clickMenuButton4 = new ViewMenuButton();
	   clickMenuButton4.setName("客户服务");
	   clickMenuButton4.setType("view");
	   clickMenuButton4.setUrl("http://106.12.219.106/yj-shop-web/service.html");
	   ViewMenuButton clickMenuButton5 = new ViewMenuButton();
	   clickMenuButton5.setName("商家入驻申请");
	   clickMenuButton5.setType("view");
	   clickMenuButton5.setUrl("http://106.12.219.106/yj-shop-web/company/index.html");
	   MenuButton menuButtons [] = {clickMenuButton4,clickMenuButton5};
	   clickMenuButton3.setSub_button(menuButtons);
	   menu.setButton(new MenuButton[]{clickMenuButton1,clickMenuButton2,clickMenuButton3});
	   return menu;
   }
   
   /*
    * 创建自定义菜单
    */
   public static int creatMenu(String accessToken,Menu menu) throws IOException{
	   int  result = 0;
	   String str = JSONObject.toJSONString(menu);
	   String menuUrl = Menu_Url.replace("ACCESS_TOKEN",accessToken);
	   String sendResult = sendInfoPost(menuUrl,str);
	   JSONObject json = JSONObject.parseObject(sendResult);
	   if(json != null){
		   result = (int) json.get("errcode");
	   }
	   return result;
   }
   
   public static void main(String[]args){
	   AccessToken accessToken =  getAccessToken();
	   try {
		creatMenu(accessToken.getAccessToken(),getMenu());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
