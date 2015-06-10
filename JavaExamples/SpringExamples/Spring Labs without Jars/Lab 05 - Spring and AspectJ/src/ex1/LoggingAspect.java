package ex1;

import org.aspectj.lang.JoinPoint;

//This is an Aspect class
public class LoggingAspect {

	//This is an advice.
	//Pointcut means where will this advice be applied.
	public void log(JoinPoint joinPoint) {
		System.out.println("common logging code executed for : "+joinPoint);
	}
	
}
