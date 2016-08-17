package com.struts2.front.action.accesswebelements;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction2 extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

	private Map<String, Object> request ;
	private Map<String, Object> session;
	private Map<String, Object> application;

	/**
	 * @DI 依赖注入
	 * @IOC 控制反转
	 * @return
	 * @throws Exception
	 */
	@Override
	public String execute() throws Exception {
		request.put("r1", "r2");
		session.put("s1", "s2");
		application.put("a1", "a2");
		return SUCCESS;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}
}
