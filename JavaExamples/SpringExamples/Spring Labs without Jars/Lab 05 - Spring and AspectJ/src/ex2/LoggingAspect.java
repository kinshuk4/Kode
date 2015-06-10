package ex2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	//TODO: Try other pointcut expressions also as mentioned in slide no. 203-207
	@Before("execution(public * apply*(..))")
	public void log(JoinPoint joinPoint) {
		System.out.println("common logging code executed for : "+joinPoint);
	}	
}
