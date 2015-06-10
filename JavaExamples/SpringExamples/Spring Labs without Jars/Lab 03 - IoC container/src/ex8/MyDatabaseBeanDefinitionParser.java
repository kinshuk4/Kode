package ex8;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.w3c.dom.Element;

public class MyDatabaseBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	protected Class getBeanClass(Element element) {
		return DriverManagerDataSource.class;
	}

	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		bean.addPropertyValue("driverClassName", element.getAttribute("driverClassName"));
		bean.addPropertyValue("url", element.getAttribute("url"));
		bean.addPropertyValue("username", element.getAttribute("username"));
		bean.addPropertyValue("password", element.getAttribute("password"));
	}
}
