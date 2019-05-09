package com.svit.ecommerce.service;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import com.svit.ecommerce.model.Order;
import com.svit.ecommerce.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

  private OrderRepository orderRepository;

  public OrderServiceImpl(OrderRepository orderRepository) {
    // TODO Auto-generated constructor stub
    this.orderRepository = orderRepository;
  }

  @Override
  public @NotNull Iterable<Order> getAllOrders() {
    // TODO Auto-generated method stub
    return orderRepository.findAll();
  }

  @Override
  public Order create(Order order) {
    // TODO Auto-generated method stub
    return orderRepository.save(order);
  }

  @Override
  public void update(Order order) {
    // TODO Auto-generated method stub
    orderRepository.

  }
}
