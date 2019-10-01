package com.zensar.entities;

/**
 * @author Samraddhi Khare
 * @creation_date 25th Sep 2019 4:44PM
 * @modification_date 25th Sep 2019 4:44PM
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved
 * @Description It is a persistent class
 *              It represent database table PRODUCT2
 *              It is POJO class.
 *
 */
public class Product2 {
  private int productId;
  private String name;
  private String brand;
  private double price;
  
  public Product2() {
	
}

public Product2(int productId, String name, String brand, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
  
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product2 [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
}

  
}
