package com.practice.kickstart.enums;

public enum Status {

	AVAILABLE("AVAILABLE"), UNAVAILABLE("UNAVAILABLE");
	
	private String value;

	public String getValue() {
		return value;
	}

	private Status(String value) {
		this.value = value;
	}
	
}
