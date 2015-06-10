package ex7;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Use the same test class for testing the other db config files as well
public class DataSourceTest {

	@Test
	public void testDataSource() throws Exception {
		ApplicationContext container = new ClassPathXmlApplicationContext("ex7/db-config-1.xml");	
		DataSource dataSource = container.getBean("myDataSource", DataSource.class);
		Assert.assertNotNull(dataSource.getConnection());	
	}
}
