package com.lst.learning;

public class User {

	private int uid;
	private String username;
	private String pwd;
	private String tel;
	private String addr;

	public User(int uid, String username, String pwd, String tel, String addr) {
		this.uid = uid;
		this.username = username;
		this.pwd = pwd;
		this.tel = tel;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "User{" +
				"uid=" + uid +
				", username='" + username + '\'' +
				", pwd='" + pwd + '\'' +
				", tel='" + tel + '\'' +
				", addr='" + addr + '\'' +
				'}';
	}
}

