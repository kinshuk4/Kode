package ex1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ErrorHandlerTest2 {

	@Test
	public void testErrorHandler() {
		ApplicationContext container = new ClassPathXmlApplicationContext("ex1/ex1-config-2.xml");
		ErrorHandler2 errorHandler = container.getBean(ErrorHandler2.class);
		errorHandler.handleError(); //testing whether EL is working or not
	}
}
