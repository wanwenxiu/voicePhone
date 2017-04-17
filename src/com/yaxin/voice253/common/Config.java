package com.yaxin.voice253.common;

/**
 * 系统常量
 */
public class Config
{
	/**
	 * url前半部分
	 */
	public static final String BASE_URL = "https://voice.253.com/20141029/accounts/";

	/**
	 * url中的accountSid。如果接口验证级别是主账户则传网站“个人中心”页面的“账户ID”，
	 * 如果验证级别是client则传clientNumber
	 * 。clientNumber由开发者调用“创建client接口”时平台生成并返回给开发者，或注册时平台自动生成的demo应用的clientId\
	 * 
	 */
	public static final String ACCOUNT_SID = "******";

	/**
	 * 生成sig参数用到的AUTH_TOKEN。 如果接口验证级别是主账户则传网站“个人中心”页面的“账户密钥”，
	 * 如果验证级别是client则传clientPwd。clientPwd由开发者调用
	 * “创建client接口”时平台生成并返回给开发者，或注册时平台自动生成的demo应用的clientKey
	 * 
	 */
	public static final String AUTH_TOKEN = "*******";
	
	/**
	 * 应用id   
	 */
	public static final String APP_ID = "******";

	/**
	 * 请求的内容类型，可以是application/json或application/xml
	 */
	public static final String CONTENT_TYPE = "application/json";

	/**
	 * 期望服务器响应的内容类型，可以是application/json或application/xml
	 */
	public static final String ACCEPT = "application/json";
}