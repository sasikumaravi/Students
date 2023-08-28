package com.electronics.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ac_details")	//inserting values with table name
public class Ac { 			//Attributes means inserting values inside the annotation @annotation(attributes)
	@Id						//making id as a primary key So I am making this annotation
	@GeneratedValue(strategy = GenerationType.IDENTITY)			//For auto_increment purpose
	private int id;
	private String brand;
	private int price;
	private String color;
	private float rating;
	private float ton;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public float getTon() {
		return ton;
	}
	public void setTon(float ton) {
		this.ton = ton;
	}
}
