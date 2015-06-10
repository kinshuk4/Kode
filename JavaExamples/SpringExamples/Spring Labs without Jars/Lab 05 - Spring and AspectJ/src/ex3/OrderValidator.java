package ex3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import service.Order;

@Aspect
public class OrderValidator {

	@Before("execution(* placeOrder(..)) && args(order)")
	public void validateOrder(Order order) {
		//some order validation logic here
		System.out.println("Just checking it out!");
	}
}
