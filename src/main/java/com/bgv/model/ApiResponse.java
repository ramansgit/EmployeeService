package com.bgv.model;

import java.util.Map;

public class ApiResponse {

	private final String message;
	private final Map<String, Object> input;

	public ApiResponse(String message, Map<String, Object> input) {
		this.message = message;
		this.input = input;
	}

	public String getMessage() {
		return this.message;
	}

	public Map<String, Object> getInput() {
		return this.input;
	}
}