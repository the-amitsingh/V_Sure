package com.vehicleMagnt.system.service;

import com.vehicleMagnt.system.bean.Admin;
import com.vehicleMagnt.system.dao.Adao;

public class Service {
	
	Adao obj= new Adao();
	
	public Admin insert_user(Admin obj1)
	{
		return obj.Addition(obj1);
	}
	
	public int  delete_user(int id) {
		return obj.Deletion(id);
	}
	
	public boolean Update_user(String password,int id) {
		return obj.UpdatePass(password, id);
	}
	
	public Admin Find_user(String name,String password) {
		return obj.loginsearch(name, password);
	}

}
