package com.mycompany.domain;

import java.util.Date;

public class MemberVO {
	private String userid;
	private String userpw;
	private String username;
	private String email;
	private Date regdate;
	private Date updatedate;
	
	public String getUserid() {
		return userid;
	}

	public String getUesrpw() {
		return userpw;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public Date getRegdate() {
		return regdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setUserpw(String uesrpw) {
		this.userpw = uesrpw;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	
}
