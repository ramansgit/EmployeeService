package com.bgv.model;

public class Response {

	private final String message;
	private final Employee input;

	public Response(String message, Employee input) {
		this.message = message;
		this.input = input;
	}

	public String getMessage() {
		return this.message;
	}

	public Employee getInput() {
		return this.input;
	}
}
