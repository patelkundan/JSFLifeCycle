package com.jsfdemo;

import javax.faces.bean.ManagedBean;


@ManagedBean(name="myManageBean")
public class MyManageBean {

	String firstName;	
	String fullName ;

	public void action() {
		this.fullName = "Hello" + " " + firstName;
		System.out.println("succes");
	}
	
	public void cancel() {		
		System.out.println("Action Clear");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}	

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
}
