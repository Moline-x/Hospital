package com.chinasofti.hr.test;

import java.util.ArrayList;

import org.junit.Test;

import com.chinasofti.hr.dao.DeptDao;
import com.chinasofti.hr.pojo.Dept;

public class TestDeptDao {
	
	DeptDao dao = new DeptDao();
	
	@Test
	public void testInsert(){
		Dept dept = new Dept("����","��������");
		//Dept dept1 = new Dept("��Ǯ��","��������");
		dao.insert(dept);
		//dao.insert(dept1);
	}
	@Test
	public void testUpdate(){
		Dept dept = new Dept(40,"��Ǯ��","����������");
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
