package com.vehicleMagnt.system.bean;


public class PasswordUpdateRequest {
    private String id;
    private String old;
    private String newp;
    private String confirm;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOld() {
		return old;
	}
	public void setOld(String old) {
		this.old = old;
	}
	public String getNewp() {
		return newp;
	}
	public void setNewp(String newp) {
		this.newp = newp;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public PasswordUpdateRequest(String id, String old, String newp, String confirm) {
		super();
		this.id = id;
		this.old = old;
		this.newp = newp;
		this.confirm = confirm;
	}


}
