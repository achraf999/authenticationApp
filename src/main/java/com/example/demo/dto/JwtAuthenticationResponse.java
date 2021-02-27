package com.example.demo.dto;

import lombok.Value;

@Value
public class JwtAuthenticationResponse {
	public JwtAuthenticationResponse(String accessT, UserInfo user) {
		this.accessToken = accessT;
		this.user = user;
	}
	private String accessToken;
	private UserInfo user;
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	
	
}