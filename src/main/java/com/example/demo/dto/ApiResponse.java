package com.example.demo.dto;

import lombok.Value;

@Value
public class ApiResponse {
	public ApiResponse(boolean success, String message) {
this.message = message;
this.success = success;
}
	private Boolean success;
	private String message;
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}