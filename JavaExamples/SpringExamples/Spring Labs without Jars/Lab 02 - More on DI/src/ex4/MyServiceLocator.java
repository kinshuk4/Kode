package ex4;

import org.springframework.beans.factory.FactoryBean;

public class MyServiceLocator implements FactoryBean<MyService> {

	@Override
	public MyService getObject() throws Exception {
		return new MyService();
	}

	@Override
	public Class<?> getObjectType() {
		return MyService.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}	
}
