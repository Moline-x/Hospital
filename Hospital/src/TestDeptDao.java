package com.chinasofti.hr.test;

import java.util.ArrayList;

import org.junit.Test;

import com.chinasofti.hr.dao.DeptDao;
import com.chinasofti.hr.pojo.Dept;

public class TestDeptDao {
	
	DeptDao dao = new DeptDao();
	
	@Test
	public void testInsert(){
		Dept dept = new Dept("财务部","辽宁大连");
		//Dept dept1 = new Dept("收钱部","辽宁大连");
		dao.insert(dept);
		//dao.insert(dept1);
	}
	@Test
	public void testUpdate(){
		Dept dept = new Dept(40,"收钱部","北京海淀区");
		dao.update(dept);
	}
	@Test
	public void testDelete(){
		dao.delete(250);
//		System.out.println(dao.delete(40));
	}
	@Test
	public void testQueryById(){
		Dept dept = dao.queryById(10);
		System.out.println(dept);
	}
	@Test
	public void testQuery(){
		ArrayList<Dept> list  = dao.query();
		
		for(Dept dept : list){
			System.out.println(dept);
		}
	}

}
