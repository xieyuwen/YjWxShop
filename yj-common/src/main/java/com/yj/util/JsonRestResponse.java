package com.yj.util;


/**
 * @项目名：公司内部模板项目
 * @作者：zhou.ning
 * @描述：返回结果类
 * @日期：Created in 2018/6/8 11:15
 */

public class JsonRestResponse{
    //返回状态码
   
    private String code;
    //返回状态描述
    
    private String desc;
    //返回result结果
    
    private Object result;
    //返回附加值
   
    private Object attach;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public Object getAttach() {
		return attach;
	}

	public void setAttach(Object attach) {
		this.attach = attach;
	}
    
    

}
