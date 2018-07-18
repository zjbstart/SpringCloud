package com.atguigu.springcloud.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dept implements Serializable {

	private Long deptNo;
	private String dname;
	private String db_source;
	
	public Dept() {
		
	}

	public Dept(Long deptNo, String dname, String db_source) {
		super();
		this.deptNo = deptNo;
		this.dname = dname;
		this.db_source = db_source;
	}

	public Long getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Long deptNo) {
		this.deptNo = deptNo;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
	
	public static void main(String[] args) {
		System.out.println("hello ");
	}
	
	
	
} 
