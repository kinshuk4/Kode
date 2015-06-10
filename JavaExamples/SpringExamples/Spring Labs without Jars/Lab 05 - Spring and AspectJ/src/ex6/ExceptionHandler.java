package ex6;

import java.util.Locale;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

@Aspect
public class ExceptionHandler implements MessageSourceAware {

	private MessageSource messageSource;

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@AfterThrowing(pointcut="execution(* someBusinessMethod(..))", throwing="ex")
	public void handleException(JoinPoint jp, RuntimeException ex) throws Throwable {
		System.out.println("Routine exception handling code here.");
		System.out.println("Let's see who has raised an exception!");
		System.out.println("===================================");
		System.out.println(jp.getSignature().getName());
		System.out.println("===================================");
		throw new BusinessException(messageSource.getMessage(jp.getSignature().getName(), null, Locale.getDefault()));
	}
}
