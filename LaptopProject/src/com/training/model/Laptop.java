package com.training.model;

public class Laptop {
	String brandname;
	int brandid;
	double price;
	int rating;

	public Laptop() {
		super();
	}
	

	@Override
	public String toString() {
		return "Laptop [brandname=" + brandname + ", brandid=" + brandid + ", price=" + price + ", rating=" + rating
				+ "]";
	}


	public Laptop(String brandname, int brandid, double price, int rating) {
		super();
		this.brandname = brandname;
		this.brandid = brandid;
		this.price = price;
		this.rating = rating;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public int getBrandid() {
		return brandid;
	}

	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
