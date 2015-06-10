package ex3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//implementing lifecycle callback methods
public class LifecycleBean implements 
			ApplicationContextAware, InitializingBean, DisposableBean {

	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		//store the context reference in a local variable
		this.ctx = ctx;
		System.out.println("setApplicationContext method of LifecycleBean called..");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//some custom initialization
		System.out.println("afterPropertiesSet method of LifecycleBean called..");
	}

	@Override
	public void destroy() throws Exception {
		//some custom cleanup
		System.out.println("destroy method of LifecycleBean called..");
	}

	
}
