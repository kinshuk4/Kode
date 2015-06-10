package ex6;

import org.springframework.context.ApplicationListener;

public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

    private String notificationAddress;
    
    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    public void onApplicationEvent(BlackListEvent event) {
    	String blackListedEmailAddr = event.getAddress();
       	System.out.println("Received notification about a blacklisted email address "+blackListedEmailAddr);
        // notify appropriate person...    	
    }
}
