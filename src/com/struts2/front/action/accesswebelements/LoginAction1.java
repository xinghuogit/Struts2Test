/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：LoginAction1.java
 * 内容摘要：LoginAction1.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月17日 下午5:35:49
 * 修改记录：
 * 修改日期：2016年8月17日 下午5:35:49
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.front.action.accesswebelements;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @filename 文件名称：LoginAction1.java
 * @contents 内容摘要：
 */
public class LoginAction1 extends ActionSupport {
	private Map request;
	private Map session;
	private Map application;

	public LoginAction1() {
		request = (Map) ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}

	@Override
	public String execute() throws Exception {
		request.put("r1", "rv1");
		session.put("s1", "sv1");
		application.put("a1", "av1");
		return SUCCESS;
	}
}
