package com.user.bean;

public class user {

	private int id;
	private String name;
	private String phonenumber;
	private String username;
	private String password;
	
	public user() {
		
	}
	public user(int id,String name,String phonenumber) {
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
	}
	
	
	
	public user(int id, String name, String phonenumber, String username, String password) {
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.username = username;
		this.password = password;
	}
	
	public user(int id,String name,String phonenumber,String password) {
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.password = password;
	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
