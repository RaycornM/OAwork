package com.tedu.bean;

import java.util.Date;

public class OaRootBean {
	private int uid;
	private String uname;
	private String upwd;
	private int permissions;
	
	@Override
	public String toString() {
		return "OaRootBean [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", permissions=" + permissions + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public int getPermissions() {
		return permissions;
	}
	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}
	
}