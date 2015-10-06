package com.tm.webservices.domain;

public class Message {
	private String text;
	private int result;

	public Message(String text, int result) {
		this.text = text;
		this.result = result;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
