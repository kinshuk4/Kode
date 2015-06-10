package ex3;

import javax.sql.DataSource;

public class MyServiceLocator {

	public MyService createMyService() {
		//we assume there is some complex code to initialize MyService bean
		return new MyService();
	}
	
	public MyService createMyService(DataSource dataSource) {
		//some database specific code to fetch values required for instantiating the bean
		return new MyService();
	}
}
