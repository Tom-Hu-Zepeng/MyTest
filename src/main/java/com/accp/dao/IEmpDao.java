package com.accp.dao;

import java.util.List;

import com.accp.pojo.Dept;

public interface IEmpDao {

	/**
	 * 查询所有
	 * @return
	 */
	public List<Dept> queryByAll();
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	public Dept queryById(int id);
	
	/**
	 * 根据ID删除
	 * @param id
	 * @return
	 */
	public int deleteById(int id);
}
