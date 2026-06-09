package com.example.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Login Request DTO")
public class LoginRequest {

	@Schema(example = "john")
	private String username;

	@Schema(example = "password123")
    private String password;
    public LoginRequest() {
		// TODO Auto-generated constructor stub
	}
	public LoginRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
    
}
