package com.haythmKenway.shellcode.domain;

public class User {
	private Integer userId;
	private String name;
	private String email;
	private String password;
	private String phone;
	public User(Integer userId, String name,String phone, String email, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
