/**
 * 
 */
package com.bancoazteca.bdm.beans;

/**
 * @author bruz-
 *
 */
public class Message {

	private String message;

	public Message() {
		this.message = "";
	}

	public Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
