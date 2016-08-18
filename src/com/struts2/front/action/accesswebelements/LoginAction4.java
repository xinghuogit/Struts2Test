/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：LoginAction4.java
 * 内容摘要：LoginAction4.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月18日 上午9:22:30
 * 修改记录：
 * 修改日期：2016年8月18日 上午9:22:30
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.front.action.accesswebelements;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @filename 文件名称：LoginAction4.java
 * @contents 内容摘要：
 */
public class LoginAction4 extends ActionSupport implements ServletRequestAware {
	private HttpServletRequest request;
	private HttpSession session;
	private ServletContext application;

	@Override
	public String execute() throws Exception {
		request.setAttribute("r1", "r4");
		session.setAttribute("s1", "s4");
		application.setAttribute("a1", "a4");
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
		this.application = session.getServletContext();
	}

}
