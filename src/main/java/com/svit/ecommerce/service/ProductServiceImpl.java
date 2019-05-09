package com.svit.ecommerce.service;

import javax.transaction.Transactional;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import com.svit.ecommerce.exception.ResourceNotFoundException;
import com.svit.ecommerce.model.Product;
import com.svit.ecommerce.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

  private ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
    // TODO Auto-generated constructor stub
    this.productRepository = productRepository;
  }

  @Override
  public @NotNull Iterable<Product> getAllProducts() {
    // TODO Auto-generated method stub
    return productRepository.findAll();
  }

  @Override
  public Product getProduct(@Min(value = 1, message = "Invalid product ID.") long id) {
    // TODO Auto-generated method stub
    return productRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("ProductNotFound"));
  }

  @Override
  public Product save(Product product) {
    // TODO Auto-generated method stub
    return productRepository.save(product);
  }

}
