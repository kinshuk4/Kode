package ex4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {

	public BeanFactoryPostProcessorImpl() {
		System.out.println("BeanFactoryPostProcessorImpl class instantiated..");
	}
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory factory)
			throws BeansException {
		System.out.println("postProcessBeanFactory method of our BeanFactoryPostProcessorImpl class called..");
		
		//dynamically registering a new bean in the context. you can try this later on.
		//similar to @Configuration and @Bean we saw in previous section.
		//factory.registerSingleton("myBean", new SampleBean());
	}	
}
