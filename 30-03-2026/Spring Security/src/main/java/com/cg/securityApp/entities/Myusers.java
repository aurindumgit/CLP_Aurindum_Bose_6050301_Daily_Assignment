package com.cg.securityApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Myusers {
	@Id
	private String username;
	private String password;
	private String role;
	private boolean active;
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getRole() {
		return role;
	}
	public boolean isActive() {
		return active;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}
