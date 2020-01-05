package com.accp.pojo;

import java.util.List;

public class Dept {
	
	private int id;			  	//部门ID
	private String name;		//部门名称
	private String address;		//部门地址
	
	private List<Emp> emp;	//部门

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", address=" + address + ", emp=" + emp + "]";
	}

	public Dept(int id, String name, String address, List<Emp> emp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.emp = emp;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
