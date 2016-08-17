/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：UserAction.java
 * 内容摘要：UserAction.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月16日 下午2:15:36
 * 修改记录：
 * 修改日期：2016年8月16日 下午2:15:36
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.front.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts2.front.model.User;
import com.struts2.front.util.StringUtil;

/**
 * @filename 文件名称：UserAction.java
 * @contents 内容摘要：
 */
public class UserAction extends ActionSupport {
	// >ActionAttrParamInput开始 使用action属性接收参数
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 用DomainModel接收参数 用的多
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// 用ModelDriven接收参数
	private User ruser = new User();

	public User getModel() {
		return ruser;
	}

	public String add() {
		if (StringUtil.isEmpty(name) || !name.equals("admin")) {
			this.addFieldError("name", "name为空");
			this.addFieldError("name", "name是错误的");
			return ERROR;
		}
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		// System.out.println("name:" + user.getName());
		// System.out.println("age:" + user.getAge());
		// System.out.println("name:" + ruser.getName());
		// System.out.println("age:" + ruser.getAge());
		return SUCCESS;
	}

}
