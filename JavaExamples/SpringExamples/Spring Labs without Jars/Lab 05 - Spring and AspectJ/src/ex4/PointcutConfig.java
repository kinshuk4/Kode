package ex4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutConfig {

	@Pointcut("execution(public * service.*.*(..))") //This is a pointcut expression
    public void serviceComponents() {} //This is a name given to the pointcut expression
    
    @Pointcut("execution(* apply*(..))")
    public void applyMethods() {}
        	
}
