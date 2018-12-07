package io.altar.messages;

import javax.enterprise.inject.Default;

@Default
public class Email implements MessagesInterface {

	@Override
	public String send() {
		
		return "E-mail was send.";
	}

}
