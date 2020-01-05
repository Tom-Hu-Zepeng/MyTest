package com.accp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.EmpBiz;
import com.accp.pojo.Dept;
import com.accp.pojo.Emp;

@RestController
@RequestMapping("/api/depts") // 命名空间
public class EmpAction {

	@Autowired
	private EmpBiz emp;
	
	@GetMapping
	public List<Dept> queryByAll(){
		return emp.queryByAll();
	}
	
	@GetMapping("/emp/{id}")
	public List<Emp>  queryById(@PathVariable Integer id) {
		List<Emp> lplp= emp.queryById(id).getEmp();
		return lplp;
	}
	
	@DeleteMapping("/emp/{id}")
	public Map<String, Object> removeById(@PathVariable Integer id){
		Map<String, Object> message = new HashMap<String, Object>();
		boolean ko=emp.removeById(id);
		if(ko) {
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "no");
		}
		return message;
	}
}
