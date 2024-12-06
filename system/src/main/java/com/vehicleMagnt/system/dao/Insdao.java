package com.vehicleMagnt.system.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.vehicleMagnt.system.bean.Insurance;
import com.vehicleMagnt.system.util.Helper;




public class Insdao {
	
	public int Insertion(Insurance obj)
	{
		int result=0;
		try
		{
			Connection cn= Helper.connect();
			PreparedStatement ps= cn.prepareStatement("Insert into undertb(vehicleno,make,model,startdate,enddate,premiumAmount)values(?,?,?,?,?,?)");
			ps.setString(1,obj.getVehicleno());
			ps.setString(2,obj.getMake());
			ps.setString(3, obj.getModel());
			ps.setString(4, obj.getStartdate());
			ps.setString(5, obj.getEnddate());
			ps.setDouble(6, obj.getPrimiumAmount());
			result= ps.executeUpdate();
			Helper.closeAll(ps, cn, null);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	public  ArrayList<Insurance> searching(String vehicleno)
	{
		ArrayList<Insurance> ls= new ArrayList<>();
		try {
		Connection cn= Helper.connect();
		PreparedStatement ps= cn.prepareStatement("select * from undertb where vehicleno=?");
		ps.setString(1, vehicleno);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			SimpleDateFormat df= new SimpleDateFormat("yyyy-mm-dd");
			String startdate1= df.format(rs.getDate(5));
			String enddate1= df.format(rs.getDate(6));
			Insurance obj= new Insurance(rs.getString(2),rs.getString(3),rs.getString(4),startdate1,enddate1,rs.getDouble(7));
			obj.setInsuranceid(rs.getInt(1));
			ls.add(obj);
		}
		Helper.closeAll(ps, cn, rs);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
		
	}
	
	public  ArrayList<Insurance> getAll()
	{
		ArrayList<Insurance> ls= new ArrayList<>();
		try {
		Connection cn= Helper.connect();
		PreparedStatement ps= cn.prepareStatement("select * from undertb);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			SimpleDateFormat df= new SimpleDateFormat("yyyy-mm-dd");
			String startdate1= df.format(rs.getDate(5));
			String enddate1= df.format(rs.getDate(6));
			Insurance obj= new Insurance(rs.getString(2),rs.getString(3),rs.getString(4),startdate1,enddate1,rs.getDouble(7));
			obj.setInsuranceid(rs.getInt(1));
			ls.add(obj);
		}
		Helper.closeAll(ps, cn, rs);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
		
	}
	
	
	public  ArrayList<Insurance> searchinghistroy(String vehicleno)
	{
		ArrayList<Insurance> ls= new ArrayList<>();
		try {
		Connection cn= Helper.connect();
		PreparedStatement ps= cn.prepareStatement("select * from undertb where vehicleno=? order by startdate");
		ps.setString(1, vehicleno);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			SimpleDateFormat df= new SimpleDateFormat("yyyy-mm-dd");
			String startdate1= df.format(rs.getDate(5));
			String enddate1= df.format(rs.getDate(6));
			Insurance obj= new Insurance(rs.getString(2),rs.getString(3),rs.getString(4),startdate1,enddate1,rs.getDouble(7));
			obj.setInsuranceid(rs.getInt(1));
			ls.add(obj);
		}
		Helper.closeAll(ps, cn, rs);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
		
	}
	
	public static int updation(String password,int id)
	{
		int result=0;
		try {
			Connection cn= Helper.connect();
			PreparedStatement ps= cn.prepareStatement("update usertb set password=? where underid=?");
			ps.setString(1, password);
			ps.setInt(2, id);
			result= ps.executeUpdate();
			Helper.closeAll(ps, cn, null);	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	public static int update_password(String id,String password)
	{
		int result=0;
		try {
			Connection cn= Helper.connect();
			PreparedStatement ps= cn.prepareStatement("update usertb set password=? where id=?");
			ps.setString(1, password);
			ps.setString(2, id);
			result= ps.executeUpdate();
			Helper.closeAll(ps, cn, null);	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}

}
