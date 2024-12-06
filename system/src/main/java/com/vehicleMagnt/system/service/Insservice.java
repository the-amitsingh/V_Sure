package com.vehicleMagnt.system.service;

import java.util.ArrayList;

import com.vehicleMagnt.system.bean.Insurance;
import com.vehicleMagnt.system.dao.Insdao;

public class Insservice {

	Insdao obj= new Insdao();
	
	public int insert_vehicle(Insurance obj1) {
		
		return obj.Insertion(obj1);
	}
	
	public ArrayList<Insurance> search_vehicle(String vehid)
	{
		return obj.searching(vehid);
	}
	public ArrayList<Insurance> search_histroy(String vehid)
	{
		return obj.searchinghistroy(vehid);
	}
	
	public int updation(String password,int id)
	{
		return obj.updation(password, id);
	}
	
	public int to_update_password(String id, String password) 
	{
		return obj.update_password(id,password);
	}
	public ArrayList<Insurance> listitem()
	{
		return obj.getAll();
	}
	
}
