package ex6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ex6/ex6-config.xml")
public class AfterThrowingAdviceTest {

	@Autowired private BusinessInterface businessInterface;
	
	@Test
	public void testAroundAdvice() {
		try {
			businessInterface.someBusinessMethod();
		}
		catch (Exception e) {
			System.out.println("Client caught exception : "+e);
		}
	}
}
