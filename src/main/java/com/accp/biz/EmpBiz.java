package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.IEmpDao;
import com.accp.pojo.Dept;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class EmpBiz {

	@Autowired
	private IEmpDao emp;
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<Dept> queryByAll(){
		return emp.queryByAll();
	}
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	public Dept queryById(int id) {
		return emp.queryById(id);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public boolean removeById(int id) {
		return emp.deleteById(id)>0;
	}
}
