package repository;

import entity.Order;

public interface OrderRepository {

	public void processOrder(Order order);
}
