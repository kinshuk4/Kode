package ex5;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewsFeedManagerTest {

	@Test
	public void testNewsFeedManager() {
		ApplicationContext container = new ClassPathXmlApplicationContext("ex5/ex5-config.xml");	
		NewsFeedManager newsManager = (NewsFeedManager) container.getBean("newsFeedManager");
		Assert.assertNotNull(newsManager);		
	}
}
