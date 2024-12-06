package com.vehicleMagnt.system.bean;

public class Admin {
	
	private String name;
	 private String dob;
	 private String gender;
	 private String address;
	 private String doj;
	 private String password;
	 private int id;
	 private String role;

	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Admin(String name, String dob, String gender, String address, String doj, String password,String role) 
	 {
		 super();
		 this.name = name;
		 this.dob = dob;
		 this.gender = gender;
		 this.address = address;
		 this.doj = doj;
		 this.password = password;
		 this.role=role;
	 }
	 public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName()
	 {
	  return name;
	 }

	 public void setName(String name)
	 {
	 this.name = name;
	 }
	 public String getDob() 
	 {
	 return dob;
	 }
	 public void setDob(String dob) 
	 {
	 this.dob = dob;
	 }

	 public String getGender()
	 {
	 return gender;
	 }
	 public void setGender(String gender) 
	 {
	 this.gender = gender;
	 }
	 public String getAddress()
	 {
	 return address;
	 }
	 public void setAddress(String address) 
	 {
	 this.address = address;
	 }
	 public String getDoj()
	 {
	 return doj;
	 }
	 public void setDoj(String doj) 
	 {
	 this.doj = doj;
	 }
	 public String getPassword() {
	 return password;
	 }
	 public void setPassword(String password) 
	 {
	 this.password = password;
	 }


}
