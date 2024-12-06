package com.vehicleMagnt.system.bean;

public class Insurance {
	
	private int insuranceid;
	private String vehicleno;
	private String make;
	private String model;
	private String startdate;
	private String enddate;
	private double primiumAmount;
	
	public Insurance(String vehicleno, String make, String model, String startdate, String enddate, double primiumAmount) {
		super();
		this.vehicleno = vehicleno;
		this.make = make;
		this.model = model;
		this.startdate = startdate;
		this.enddate = enddate;
		this.primiumAmount = primiumAmount;
	}

	public int getInsuranceid() {
		return insuranceid;
	}

	public void setInsuranceid(int insuranceid) {
		this.insuranceid = insuranceid;
	}

	public String getVehicleno() {
		return vehicleno;
	}

	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public double getPrimiumAmount() {
		return primiumAmount;
	}

	public void setPrimiumAmount(double primiumAmount) {
		this.primiumAmount = primiumAmount;
	}
	

}
