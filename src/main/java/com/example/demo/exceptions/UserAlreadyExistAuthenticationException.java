package com.example.demo.exceptions;

public class UserAlreadyExistAuthenticationException extends RuntimeException {


		private static final long serialVersionUID = 5570981880007077317L;

		public UserAlreadyExistAuthenticationException(final String msg) {
	        super(msg);
	    }

	}


