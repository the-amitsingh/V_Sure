package com.vehicleMagnt.system.control;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.vehicleMagnt.system.bean.Admin;
import com.vehicleMagnt.system.service.*;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Controller {
	
	Service check= new Service();
@PostMapping("/addUnderWritter")

public String getuser(@RequestBody Admin obj )
{
	Admin ans= check.insert_user(obj);
	String ans1= "";
	if(ans!=null)
	{
		Gson gson=new Gson();
		ans1=gson.toJson(ans);
	}
	else {
		  ans1="User Insertion Failed";
	  }
	
	
	return ans1;
}

@DeleteMapping("/deletUnderWriter/{userId}")

public String del_User(@PathVariable int userId) {
	String ans="";
	int ans1=check.delete_user(userId);
	if(ans1>0) {
		ans="user deleted";
	} else {
		ans="User deletion failed";
		
	}
	return ans;
}
@PostMapping("/login/{name}/{pass}")

public String login(@PathVariable String name,@PathVariable String pass) {
	String ans="";
	
	return ans;
}
 
}
	
	

