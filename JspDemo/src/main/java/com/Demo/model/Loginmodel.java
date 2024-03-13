package com.Demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loginmodel {

	@Id
	private int id;
	private String pswd;
	
	public Loginmodel()
	{ }
	public Loginmodel(int id, String pswd) {
		super();
		this.id = id;
		this.pswd = pswd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	
	
}
