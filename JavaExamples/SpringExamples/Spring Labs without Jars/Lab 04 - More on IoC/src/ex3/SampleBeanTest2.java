package ex3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex3/ex3-config.xml")
public class SampleBeanTest2 {

	//Inject the bean which we need to test.
	//Why to do it manually. So DI in JUnit also!!
	@Autowired
	private SampleBean sampleBean;

	@Test
	public void testSampleBean() {
		//just need to now concentrate on testing the bean
		sampleBean.sampleMethod();
	}
}
