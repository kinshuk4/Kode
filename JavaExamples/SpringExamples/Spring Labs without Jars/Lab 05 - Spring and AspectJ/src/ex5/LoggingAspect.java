package ex5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

	@After("bean(*Service)")
	public void log(JoinPoint joinPoint) {
		System.out.println("log advice got executed after call to method : "+joinPoint.getSignature().getName());
	}
	
	@AfterReturning(pointcut="execution(* balance(..)) && args(acno)", returning="balance")
	public void validate(JoinPoint joinPoint, long acno, double balance) {
		System.out.println("validate advice called after successful return from balance method");
		System.out.println("acno passed was "+acno+" and the balance returned was "+balance);
	}
}
