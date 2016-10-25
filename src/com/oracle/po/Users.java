package com.oracle.po;

public class Users {

	private int usersId;
	private String usersName;
	private String usersPassword;
	
	public int getUsersId() {
		return usersId;
	}
	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}
	public String getUsersName() {
		return usersName;
	}
	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}
	public String getUsersPassword() {
		return usersPassword;
	}
	public void setUsersPassword(String usersPassword) {
		this.usersPassword = usersPassword;
	}
	@Override
	public String toString() {
		return "Users [usersId=" + usersId + ", usersName=" + usersName
				+ ", usersPassword=" + usersPassword + "]";
	}
	
	
	
}
