package com.yaxin.voice253.common;



/**
 * 双向回拨接口调用示例
 * 请在回拨接口中设置主叫号码和被叫号码，并调用回拨接口，若调用成功，则会先后接通主叫和被叫号码，实现通话。
 * 若在回拨接口中设置clientNumber（Client帐号，必须绑定了测试号码），则会接通子账号绑定的测试号码和被叫号码，实现通话。
 */
public class Callback
{
	/**
	 * url中{function}/{operation}?部分
	 */
	private static String funAndOperate = "call/callBack?";
	// private static String funAndOperate = "demo/callBack?"; // 注册时自动生成的 测试应用 请使用这个值

	// 参数详述请参考http://www.qingmayun.com/document.html、
	private static String caller = "1353300xxxx";//主叫电话号码, 必须是配置/绑定的主叫正常的电话号码(必填)
	//private static String clientNumber = "103213212313";//子账号 
	//caller and clientNumber  变量二选一即可
	
	private static String called = "1850711xxxx";//被叫电话号码(必填)
	private static String fromSerNum = "1850711xxxx";//主叫侧显示的号码(可选)
	private static String toSerNum = "1353300xxxx";//被叫侧显示的号码(可选)
	private static String allowedCallTime = "50";//被叫侧显示的号码(可选)
	/**
	 * 双向回拨
	 */
	public static void callBack()
	{
		String body = null;
		if (Config.CONTENT_TYPE.equals("application/json"))
		{
			body = "{ \"callback\" : { \"appId\" : \"" + Config.APP_ID + "\", \"caller\" : \"" + caller + "\", \"called\" : \""
					+ called + "\", \"fromSerNum\" : \"" + fromSerNum + "\", \"toSerNum\" : \"" + toSerNum + "\", \"allowedCallTime\" : \"" + allowedCallTime + "\"}}";
		} else if (Config.CONTENT_TYPE.equals("application/xml"))
		{
			body = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><callback> <appId>" + Config.APP_ID + "</appId>  <caller>"
					+ caller + "</caller> <called>" + called + "</called> <fromSerNum>" + fromSerNum
					+ "</fromSerNum> <toSerNum>" + toSerNum + "</toSerNum> <allowedCallTime>" + allowedCallTime + "</allowedCallTime></callback>";
		} else
		{
			System.out.println("不支持的Config.CONTENT_TYPE");
			return;
		}

		// 提交请求
		String result = HttpUtil.post(funAndOperate, body);
		System.out.println("result:" + result);
	}
	/**
	 * 双向回拨
	 */
	public static void callBack2()
	{
		String body = null;
		if (Config.CONTENT_TYPE.equals("application/json"))
		{
			body = "{ \"callback\" : { \"appId\" : \"" + Config.APP_ID + "\", \"caller\" : \"" + caller + "\", \"called\" : \""
					+ called + "\", \"fromSerNum\" : \"" + fromSerNum + "\", \"toSerNum\" : \"" + toSerNum + "\", \"allowedCallTime\" : \"" + allowedCallTime + "\"}}";
		} else if (Config.CONTENT_TYPE.equals("application/xml"))
		{
			body = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><callback> <appId>" + Config.APP_ID + "</appId>  <caller>"
					+ caller + "</caller> <called>" + called + "</called> <fromSerNum>" + fromSerNum
					+ "</fromSerNum> <toSerNum>" + toSerNum + "</toSerNum> <allowedCallTime>" + allowedCallTime + "</allowedCallTime></callback>";
		} else
		{
			System.out.println("不支持的Config.CONTENT_TYPE");
			return;
		}
		// 提交请求
		String result = HttpUtil.post("call2/callBack?", body);
		System.out.println("result:" + result);
	}
}
