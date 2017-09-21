package com.ssh.hotel.entities;

public class User {
	private String userName;
	
	private String password;
	
	private String sex;
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", sex=" + sex + "]";
	}
	
	
}
