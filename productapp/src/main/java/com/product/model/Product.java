package com.product.model;

public class Product {
	private int id;
	private String name;
	private float rating;
	private double cost;
	private String manufacturerName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public Product(int id, String name, float rating, double cost, String manufacturerName) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.cost = cost;
		this.manufacturerName = manufacturerName;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", rating=" + rating + ", cost=" + cost + ", manufacturerName="
				+ manufacturerName + "]";
	}
	

}
