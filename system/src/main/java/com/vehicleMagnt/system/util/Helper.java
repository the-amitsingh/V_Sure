package com.vehicleMagnt.system.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Helper {
	
	public static Connection connect()
	{
		Connection cn= null;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			cn=DriverManager.getConnection("jdbc:derby:C:\\Users\\ANURANJAN\\Downloads\\system\\UserDB1;create=true");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cn;
	}
	public static void closeAll(PreparedStatement ps,Connection cn, ResultSet rs)
	{
		try
		{
			if(ps!=null)
			{
				ps.close();
			}
			if(rs!=null)
			{
				rs.close();
			}
			if(cn!=null)
			{
				cn.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			Connection cn= connect();
//			PreparedStatement ps= cn.prepareStatement("create table usertb(underid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 101, INCREMENT BY 1 ),name varchar(50),dob varchar(40),gender varchar(10),address varchar(50),doj varchar(40),password varchar(50),role varchar(20) )");
//			int t= ps.executeUpdate();
//			System.out.println(t);
//			PreparedStatement ps= cn.prepareStatement("Insert into usertb (name,dob,gender,address,doj,password,role) values('anuranjan','24-01-2002','Male','Bihar','22-11-2024','admin12','admin')");
//			int t= ps.executeUpdate();
//			System.out.println(t);
//			PreparedStatement ps= cn.prepareStatement("Insert into usertb (name,dob,gender,address,doj,password,role) values('Mehul Kumar','24-01-2002','Male','Bihar','22-11-2024','Employee@123','user')");
//			 int t= ps.executeUpdate();
//			System.out.println(t);
			
//			PreparedStatement ps= cn.prepareStatement("create table undertb(insuranceid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1001,INCREMENT BY 1)primary key, vehicleno varchar(50),make varchar(40),model varchar(50),startdate date,enddate date,premiumAmount decimal(10,2))");
//			int t= ps.executeUpdate();
//			System.out.println(t);
			
			PreparedStatement ps= cn.prepareStatement("insert into undertb(vehicleno,make,model,startdate,enddate,premiumAmount) values('AB123CD','toyota','corolla','2024-01-11','2025-01-11',5000.00)");
			int t= ps.executeUpdate();
			System.out.println(t);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
