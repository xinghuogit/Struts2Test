/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：TeacherAction.java
 * 内容摘要：TeacherAction.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月16日 下午3:55:42
 * 修改记录：
 * 修改日期：2016年8月16日 下午3:55:42
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.front.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @filename 文件名称：TeacherAction.java
 * @contents 内容摘要：
 */
public class TeacherAction extends ActionSupport {
	public String add() {
		System.out.println("tadd");
		return SUCCESS;
	}

	public String delete() {
		System.out.println("tdelete");
		return SUCCESS;
	}
}
