package ex3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//customizing initialization/cleanup via xml configuration
public class LifecycleBean2 implements ApplicationContextAware {

	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		//store the context reference in a local variable
		this.ctx = ctx;
		System.out.println("setApplicationContext method of LifecycleBean2 called..");
	}

	public void setup() {
		//some custom initialization
		System.out.println("custom init-method of LifecycleBean2 called..");
	}

	public void cleanup() {
		//some custom cleanup
		System.out.println("custom destroy-method of of LifecycleBean2 called..");
	}	
}
