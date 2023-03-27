package com.mobileshop;

public class Mobile {

	private String mbtype;
	private float price;
	private String brandname;

	public Mobile() {

	}

	public Mobile(String mtype, float price, String brandname) {
		super();
		this.mbtype = mtype;
		this.price = price;
		this.brandname = brandname;
	}

	public String getMtype() {
		return mbtype;
	}

	public void setMtype(String mtype) {
		this.mbtype = mtype;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	@Override
	public String toString() {
		return "Mobile [mtype=" + mbtype + ", price=" + price + ", brandname=" + brandname + "]";
	}

}