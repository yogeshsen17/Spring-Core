package com.rays.bean;

public class UserBean {
	
	private String login = null ;
	private String password = null;
	
	public UserBean() {
		}
	
	public UserBean(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
