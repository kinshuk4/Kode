package ex3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Writing a test class the way we have been doing it till now
public class SampleBeanTest {

	@Test
	public void testSampleBean() {
		//everytime we need to take care of creating an ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex3/ex3-config.xml");
		//then we need to call getBean() to access a particular bean which we need to test
		SampleBean sampleBean = ctx.getBean(SampleBean.class);
		//and then finally we get a change to test the bean method
		sampleBean.sampleMethod();
	}
}
