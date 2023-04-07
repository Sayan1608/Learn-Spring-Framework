package com.hibernate.OneToOne.bidirectional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	@Column(name = "u_id")
	private int userId;
	private String userName;

	@OneToOne(mappedBy = "user")
	private UserCredentials userCredentials;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public User(int userId, String userName, UserCredentials userCredentials) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userCredentials = userCredentials;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userCredentials=" + userCredentials + "]";
	}
}
