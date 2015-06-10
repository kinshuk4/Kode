package ex7;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

@Aspect
public class ProfilingAspect {

	@Around("execution(* *(..))")
	public Object profile(ProceedingJoinPoint joinPoint) throws Throwable {
		StopWatch watch = new StopWatch();
		watch.start(joinPoint.getSignature().getName());
		try {
			return joinPoint.proceed(); //calling the target method
		}
		catch(Exception e) {
			throw e;
		}
		finally {
			watch.stop();
			System.out.println(watch.prettyPrint());
		}
	}
}
