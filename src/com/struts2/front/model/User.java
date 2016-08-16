/*************************************************************************************************
 * @版权所有 (C)2015,  星火工作室
 * 
 * @文件名称：User.java
 * @内容摘要：用户bean
 * @当前版本： TODO
 * @作        者： 李加蒙
 * @完成日期：2015年9月20日 下午6:25:05
 * @修改记录：
 * @修改日期：2015年9月20日 下午6:25:05
 * @版   本  号：
 * @修   改  人：
 * @修改内容：
 ************************************************************************************************/

package com.struts2.front.model;

import java.io.Serializable;

/**
 * @filename 文件名称：User.java
 * @contents 内容摘要：用户注册bean
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

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
}
