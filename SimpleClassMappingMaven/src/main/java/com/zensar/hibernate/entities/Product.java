package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 
 * @author Priya Mirchandani
 * @creationdate 1 oct 2019  10.12am
 * @modificationdate 1 oct 2019 10.12 am
 * @version 2.0
 * @copyright zensar technologies .all rights reserved.
 * @description it is a persistent class.
 *
 */
@Entity
public class Product {
	@Id
	@Column(name="id")
private int productId;
private String name;
private String  brand;
private int price;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
}
	
	
	
	
}
