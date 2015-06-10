package ex4;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("ex4.PointcutConfig.applyMethods()")
	public void log(JoinPoint joinPoint) {
		System.out.println("log advice executed for method : "+joinPoint.getSignature().getName());
	}
	
	@Before("ex4.PointcutConfig.serviceComponents()")
	public void timeLog(JoinPoint joinPoint) {
		System.out.println("request for method : "+joinPoint.getSignature().getName()+" occurred at "+new Date());
	}
}
