package ex6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomEventTest {

	@Test
	public void testCustomEvent() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex6/ex6-config.xml");
		EmailBean emailer = ctx.getBean(EmailBean.class);
		//sending an email to a blacklisted id so that an event can be raised
		emailer.sendEmail("john@doe.org", "hello"); 
	}
}
