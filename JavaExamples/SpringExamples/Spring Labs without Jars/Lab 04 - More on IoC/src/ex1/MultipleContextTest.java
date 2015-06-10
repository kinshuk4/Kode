package ex1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultipleContextTest {

	@Test
	public void testMultipleContexts() {
		//creating the parent context
		ApplicationContext pContext = new ClassPathXmlApplicationContext("ex1/context-1.xml");
		//creating the child context
		ApplicationContext cContext = new 
						ClassPathXmlApplicationContext(new String[]{"ex1/context-2.xml"}, pContext);
		//accessing the bean
		CurrencyService currencyService = cContext.getBean(CurrencyService.class);
		//calling the method to verify if the parent bean was injected or not
		System.out.println(currencyService.convert(100));
	}
}
