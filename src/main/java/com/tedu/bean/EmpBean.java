package com.tedu.bean;

import java.util.Date;

public class EmpBean {
	private int id;
	private String name;
	private Date hire_date;
	private double sal;
	private String pwd;
	private int dept_id;
	
	@Override
	public String toString() {
		return "EmpBean [id=" + id + ", name=" + name + ", hire_date=" + hire_date + ", sal=" + sal + ", pwd=" + pwd
				+ ", dept_id=" + dept_id + "]";
	}
	public EmpBean() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	
	
}
