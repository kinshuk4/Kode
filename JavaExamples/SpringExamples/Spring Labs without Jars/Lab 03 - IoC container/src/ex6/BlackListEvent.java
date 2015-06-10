package ex6;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent {

	private String address;

	public String getAddress() {
		return address;
	}
	
	public BlackListEvent(String address, Object source) {
		super(source);
		this.address = address;
	}
}
