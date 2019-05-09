package com.svit.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Transient;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OrderProduct {

  @EmbeddedId
  @JsonIgnore
  private OrderProductPK pk;

  @Column(nullable = false)
  private Integer quantity;

  public OrderProduct() {
    super();
    // TODO Auto-generated constructor stub
  }


  public OrderProduct(Order order, Product product, Integer quantity) {
    pk = new OrderProducePK();
    pk.setOrder(order);
    pk.serProduct(product);
    this.quantity = quantity;
  }

  @Transient
  public Product getProduct() {
    return this.pk.getProduct();
  }

  public void setPk(OrderProductPK pk) {
    this.pk = pk;
  }

  public Integer getQuantity() {
    return quantity;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((pk == null) ? 0 : pk.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null) {
      return false;
    }

    if (getClass() != obj.getClass()) {
      return false;
    }

    OrderProduct other = (OrderProduct) obj;
    if (pk == null) {
      if (other.pk != null) {
        return false;
      }
    }

    return true;
  }
}
