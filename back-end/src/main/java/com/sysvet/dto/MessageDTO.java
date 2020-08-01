package com.sysvet.dto;

import java.io.Serializable;

public class MessageDTO implements Serializable{

	/**
	 * Serial para comparar el pass
	 */
	private static final long serialVersionUID = -132037880531883954L;
	
	
	private String message;

	public MessageDTO(String message) {
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

}
