package com.accp.pojo;

import java.util.Date;

public class Emp {

	private int id;				//员工id
	private String name;		//员工名称
	private String job;			//员工工作
	private int money;			//员工工资
	private Date tims;			//入职日期
	private int bouns;			//奖金
	private int deptId;			//部门
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int id, String name, String job, int money, Date tims, int bouns, int deptId) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.money = money;
		this.tims = tims;
		this.bouns = bouns;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", job=" + job + ", money=" + money + ", tims=" + tims + ", bouns="
				+ bouns + ", deptId=" + deptId + "]";
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Date getTims() {
		return tims;
	}
	public void setTims(Date tims) {
		this.tims = tims;
	}
	public int getBouns() {
		return bouns;
	}
	public void setBouns(int bouns) {
		this.bouns = bouns;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
}
