package com.vehicleMagnt.system.control;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.vehicleMagnt.system.bean.Insurance;
import com.vehicleMagnt.system.bean.PasswordUpdateRequest;
import com.vehicleMagnt.system.service.Insservice;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Insucontroller {

	Insservice obj= new Insservice();

	@PostMapping("/addVehicle")

	public String getvehicle(@RequestBody Insurance obj1)
	{
		int ans= obj.insert_vehicle(obj1);
		String ans1="";
		if(ans>0)
		{
			Gson gson=new Gson();
			ans1= gson.toJson(ans);
		}
		else
		{
			ans1= "Insurance Registeration failed";
		}

		return ans1;
	}

	@GetMapping("/searchVehicle/{vehid}")

	public String serachvehicle(@PathVariable String vehid)
	{
		ArrayList<Insurance> ans= obj.search_vehicle(vehid);
		String ans1="";
		if(ans.size()>0)
		{
			Gson gson= new Gson();
			ans1= gson.toJson(ans);
		}
		else
		{
			ans1="Vehicle not found";
		}

		return ans1;
	}
	@GetMapping("/searchVehicle/{vehid}")
	public String serachvehiclehist(@PathVariable String vehid)
	{
		ArrayList<Insurance> ans= obj.search_vehicle(vehid);
		String ans1="";
		if(ans.size()>0)
		{
			Gson gson= new Gson();
			ans1= gson.toJson(ans);
		}
		else
		{
			ans1="Vehicle not found";
		}

		return ans1;
	}
	@RequestMapping(value="/updatePassword" , method = RequestMethod.POST)
	public static String updatePassword(@RequestBody PasswordUpdateRequest request) {

		String id = request.getId();
		String password = request.getOld();
		String newp=request.getNewp();
		String confirm=request.getConfirm();
		System.out.println("I got the request from frontend");
		System.out.println(id);
		System.out.println(password);
		System.out.println(newp);
		System.out.println(confirm);

		Insservice service = new Insservice();
		int result = service.to_update_password(id,newp);
		String statement = "Password updated successfully.";
		if(result!=1) {
			statement = "Password Failed to Updated.";
		}
		Gson gson=new Gson();
		String response = gson.toJson(statement);
		return response;
	}
	@GetMapping("/getVehiclesData")
	{
		public static String getVehicle()
		{
			ArrayList<Insurance> ans= obj.listitem();
			String ans1="";
			Gson gson= new Gson();
			ans1= json.toJson(ans);
			return ans1;
		}
	}
}
