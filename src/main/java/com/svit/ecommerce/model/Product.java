package com.svit.ecommerce.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author bnb
 *
 */
@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull(message = "Product name is required.")
  @Basic(optional = false)
  private String name;

  private Double price;

  private String pictureUrl;

  // @Lob
  // @Column(name = "pic")
  // private byte[] pic;

  public Product(Long id, @NotNull(message = "Product name is required.") String name, Double price,
      String pictureUrl) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.pictureUrl = pictureUrl;
  }

  // public Product(Long id, @NotNull(message = "Product name is required.") String name, Double
  // price,
  // byte[] pic) {
  // this.id = id;
  // this.name = name;
  // this.price = price;
  // this.pic = pic;
  // }

  public Product() {}


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getPictureUrl() {
    return pictureUrl;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

}
