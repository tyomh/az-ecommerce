package com.svit.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class automatically
public class Employee {
  @Id
  @GeneratedValue
  private Long id;
  private String empId;
  private String empName;

}
