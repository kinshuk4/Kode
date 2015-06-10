package ex8;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CustomNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		registerBeanDefinitionParser("dataSource", new MyDatabaseBeanDefinitionParser());  
	}
}
