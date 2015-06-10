package ex6;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class EmailBean implements ApplicationContextAware {

    private List<String> blackList;
    private ApplicationContext ctx;

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    public void setApplicationContext(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public void sendEmail(String address, String text) {
        if (blackList.contains(address)) {
            BlackListEvent event = new BlackListEvent(address, this);
            ctx.publishEvent(event);
            return;
        }
        // send email...
    }
}