/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：StudentAction.java
 * 内容摘要：StudentAction.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月16日 下午3:55:26
 * 修改记录：
 * 修改日期：2016年8月16日 下午3:55:26
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.front.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @filename 文件名称：StudentAction.java
 * @contents 内容摘要：
 */
public class StudentAction extends ActionSupport {
	public String add() {
		System.out.println("sadd");
		return SUCCESS;
	}

	public String delete() {
		System.out.println("sdelete");
		return SUCCESS;
	}
}
