package service;

import org.springframework.transaction.annotation.Transactional;

import entity.Order;

public interface OnlineShoppingService {

	@Transactional
	public void placeOrder(Order order);
}
