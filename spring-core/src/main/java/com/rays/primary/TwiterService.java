package com.rays.primary;

public class TwiterService implements MessageService {
	
	public void sendMessage(String message) {
		System.out.println("Sending tweet: " + message);
	}

	

}
