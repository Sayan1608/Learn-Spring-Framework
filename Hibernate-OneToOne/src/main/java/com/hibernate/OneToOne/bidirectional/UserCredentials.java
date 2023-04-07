package com.hibernate.OneToOne.bidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class UserCredentials {

	@Id
	private int credId;
	private String username;
	private String password;

	@OneToOne
	@JoinColumn(name = "u_id")
	private User user;

	public int getCredId() {
		return credId;
	}

	public void setCredId(int credId) {
		this.credId = credId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserCredentials(int credId, String username, String password, User user) {
		super();
		this.credId = credId;
		this.username = username;
		this.password = password;
		this.user = user;
	}

	public UserCredentials() {
		super();
	}

	@Override
	public String toString() {
		return "UserCredentials [credId=" + credId + ", username=" + username + ", password=" + password + "]";
	}
}
