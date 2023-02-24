package com.klef.jfsd.springboot.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_table")
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false,length = 100)
	private String Category;
	@Column(nullable = false,length = 100)
	private String name;
	@Column(nullable = false,length = 200)
	private String description;
	@Column(nullable = false)
	private double cost;
	@Column(nullable = false,length = 2000)
	private String productlink;
	@Column(nullable = false)
	private Blob productimages;//blob.binary image obejct
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getProductlink() {
		return productlink;
	}
	public void setProductlink(String productlink) {
		this.productlink = productlink;
	}
	public Blob getProductimages() {
		return productimages;
	}
	public void setProductimages(Blob productimages) {
		this.productimages = productimages;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Category=" + Category + ", name=" + name + ", description=" + description
				+ ", cost=" + cost + ", productlink=" + productlink + ", productimages=" + productimages + "]";
	}
	

}
