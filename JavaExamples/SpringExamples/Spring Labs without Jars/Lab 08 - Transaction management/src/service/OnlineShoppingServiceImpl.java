package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repository.OrderRepository;
import repository.PaymentRepository;
import repository.ProductRepository;

import entity.Order;
import entity.Payment;

@Service
public class OnlineShoppingServiceImpl implements OnlineShoppingService {

	private OrderRepository orderRepository;
	private PaymentRepository paymentRepository;
	private ProductRepository productRepository;
	
	@Autowired
	public void init(OrderRepository orderRepository, PaymentRepository paymentRepository, ProductRepository productRepository) {
		this.orderRepository = orderRepository;
		this.paymentRepository = paymentRepository;
		this.productRepository = productRepository;
	}
	
	@Transactional
	public void placeOrder(Order order) {
		//store the order information
		orderRepository.processOrder(order);
		//store the payment details
		Payment paymentDetails = new Payment();
		paymentDetails.setOrderId(order.getOrderId());
		paymentDetails.setAmount(order.getQuantity() * order.getPrice());
		paymentRepository.store(paymentDetails);
		//update the stock
		productRepository.reduceStock(order.getProductId(), order.getQuantity());
	}
}
