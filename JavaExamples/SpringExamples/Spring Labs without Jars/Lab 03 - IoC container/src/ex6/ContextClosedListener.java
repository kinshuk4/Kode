package ex6;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedListener implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent evt) {
		//some cleanup code here
		System.out.println("Context Closed Event handled at : "+evt.getTimestamp());
	}
}
