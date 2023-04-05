package com.hibernate.OneToMany.bidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	private int accountId;
	private String accountName;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public User getUser() {
		return user;
	}

	public Account(int accountId, String accountName, User user) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.user = user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Account() {
		super();
	}
}
