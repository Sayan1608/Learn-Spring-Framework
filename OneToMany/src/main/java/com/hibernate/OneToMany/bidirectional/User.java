package com.hibernate.OneToMany.bidirectional;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	@Id
	private int userId;
	private String userName;

	@OneToMany(mappedBy = "user")
	private List<Account> accounts;

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

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public User(int userId, String userName, List<Account> accounts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.accounts = accounts;
	}

	public User() {
		super();
	}
}
