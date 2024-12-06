package com.vehicleMagnt.system.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vehicleMagnt.system.bean.Admin;
import com.vehicleMagnt.system.util.*;


public class Adao {
	
	public  Admin Addition(Admin obj)
	 {
		 Admin ans=null;
	 PreparedStatement ps=null;
	 try {
	  Connection cn= Helper.connect();
	   ps= cn.prepareStatement("Insert into usertb (name,dob,gender,address,doj,password,role) values(?,?,?,?,?,?,?)");
	   ps.setString(1, obj.getName());
	   ps.setString(2, obj.getDob());
	   ps.setString(3, obj.getGender());
	   ps.setString(4, obj.getAddress());
	   ps.setString(5, obj.getDoj());
	   ps.setString(6, "Employee123");
	   ps.setString(7, "user");
	   int result=ps.executeUpdate();
	   ps=cn.prepareStatement("select * from usertb where name=?");
	   ps.setString(1,obj.getName());
	   ResultSet rs= ps.executeQuery();
		  while(rs.next())
		  {
		   ans= new Admin(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
		   ans.setId(rs.getInt(1));
		  }

	  Helper.closeAll(ps, cn, null);
	 }
	 catch(Exception e)
	 {
	  e.printStackTrace();

	 }
	 return ans;
	 }
	
	public  int Deletion(int id)
	 {
		 int result=0;
		 try {
		  Connection cn= Helper.connect();
		  PreparedStatement ps= cn.prepareStatement("delete from usertb where underid=?");
		  ps.setInt(1, id);
		  result= ps.executeUpdate();
		 }
		 catch(Exception e)
		 {
		  e.printStackTrace();
		 }
		 return result;
	 }
	
	public  Admin Searching(int id)
	 {
		 Admin obj=null;
		 try {
		  Connection cn= Helper.connect();
		  PreparedStatement ps= cn.prepareStatement("select * from usertb where underid=?");
		  ps.setInt(1, id);
		  ResultSet rs= ps.executeQuery();
		  while(rs.next())
		  {
		   obj= new Admin(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
		   obj.setId(rs.getInt(1));
		  }
		 }
		 catch(Exception e)
		 {
		  e.printStackTrace();
		 }
		 return obj;
	 }
	
	public boolean  UpdatePass(String password,int id) {
		try {
			Connection cn=Helper.connect();
			PreparedStatement ps=cn.prepareStatement("update usertb set password=? where id=?");
			ps.setString(1, password);
			ps.setInt(2, id);
			int t=ps.executeUpdate();
			if(t>0) {
				return true;
			}
			Helper.closeAll(ps, cn, null);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	public  Admin loginsearch(String name,String pass)
	 {
		 Admin obj= null;
		 try {
			 Connection cn= Helper.connect();
			 PreparedStatement ps= cn.prepareStatement("select * from usertb where name=? AND password=?");
			 ps.setString(1, name);
			 ps.setString(2, pass);
			 ResultSet rs= ps.executeQuery();
			 while(rs.next())
			 {
				 obj= new Admin(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
				 obj.setId(rs.getInt(1));
			 }
			 System.out.println(obj.getName());		 
			 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 return obj;
	 }

	

}
