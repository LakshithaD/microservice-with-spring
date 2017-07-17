package com.lak.poc;

public class User {

	private String fName;
	
	private String lName;
	
	private String userId;
	
	public User() {
		
		super();
	}

	public User(String fName, String lName, String userId) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
