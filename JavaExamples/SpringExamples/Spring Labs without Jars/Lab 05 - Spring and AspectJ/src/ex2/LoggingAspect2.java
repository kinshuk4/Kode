package ex2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect2 {

	@Before("execution(public * apply*(..))")
	public void log(JoinPoint joinPoint) {
		Object proxyObject = joinPoint.getThis();
		Object targetBean = joinPoint.getTarget();
		Object[] args = joinPoint.getArgs();
		Signature signature = joinPoint.getSignature();
		//some logging code here
	}
}
