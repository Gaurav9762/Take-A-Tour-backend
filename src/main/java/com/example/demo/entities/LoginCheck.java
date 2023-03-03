package com.example.demo.entities;

public class LoginCheck 
{
	String uid,pwd;
	

	public LoginCheck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoginCheck(String uid, String pwd) {
		super();
		this.uid = uid;
		this.pwd = pwd;
	}


	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "LoginCheck [uid=" + uid + ", pwd=" + pwd + "]";
	}

	
	

}
