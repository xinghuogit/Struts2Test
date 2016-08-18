package com.struts2.front.action.accesswebelements;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction3 extends ActionSupport {

	private HttpServletRequest request;
	private HttpSession session;
	private ServletContext application;

	
	public LoginAction3(){
		request = ServletActionContext.getRequest();
		session = request.getSession();
		application = session.getServletContext();
	}
	
	@Override
	public String execute() throws Exception {
		request.setAttribute("r1", "r3");
		session.setAttribute("s1", "s3");
		application.setAttribute("a1", "a3");
		return SUCCESS;
	}
}
