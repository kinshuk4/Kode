package ex4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

	public BeanPostProcessorImpl() {
		System.out.println("BeanPostProcessorImpl class instantiated..");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String name)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization method of our BeanPostProcessorImpl class called for bean "+name);
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String name)
			throws BeansException {
		System.out.println("postProcessAfterInitialization method of our BeanPostProcessorImpl class called for bean "+name);
		return bean;
	}	
}
