package com.ac.company;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class UserAccount {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long pkey;
	
	@Persistent
	private String id;
	@Persistent
	private String password;
	
	public UserAccount(String id, String password) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPkey() {
		return pkey;
	}

	public String getId() {
		return id;
	}
	
	
}
