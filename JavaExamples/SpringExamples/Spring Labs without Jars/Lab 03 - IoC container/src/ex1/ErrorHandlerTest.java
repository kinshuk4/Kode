package ex1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ErrorHandlerTest {

	@Test
	public void testErrorHandler() {
		ApplicationContext container = new ClassPathXmlApplicationContext("ex1/ex1-config-1.xml");
		ErrorHandler errorHandler = container.getBean(ErrorHandler.class);
		errorHandler.handleError(); //testing whether EL is working or not
	}
}
