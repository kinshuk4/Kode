package ex7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomScopeTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex7/ex7-config.xml");
		MyRunnable r1 = new MyRunnable(ctx);
		MyRunnable r2 = new MyRunnable(ctx);
		new Thread(r1).start();
		new Thread(r2).start();
	}
	
	private static class MyRunnable implements Runnable {

		private ApplicationContext ctx;
		public MyRunnable(ApplicationContext ctx) {
			this.ctx = ctx;
		}

		public void run() {
			EmployeeService empService = (EmployeeService) ctx.getBean("empService");
			System.out.println("let's see what happens...");
		}		
	}
}

