package ex4;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationListenerImpl implements ApplicationListener {

	public ApplicationListenerImpl() {
		System.out.println("ApplicationListenerImpl class instantiated..");
	}
	
	public void onApplicationEvent(ApplicationEvent evt) {
		System.out.println("Our ApplicationListenerImpl class recevied an event notification : "+evt);
	}

	
}
