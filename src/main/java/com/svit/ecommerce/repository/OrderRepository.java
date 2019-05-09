package com.svit.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import com.svit.ecommerce.model.OrderProduct;

public interface OrderRepository extends CrudRepository<OrderProduct, Long> {


}
