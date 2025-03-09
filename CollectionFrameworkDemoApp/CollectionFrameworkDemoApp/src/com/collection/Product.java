package com.collection;

public class Product {
//implements Comparable<Product>{
	private int pid;
	private String pname;
	private double price;
	//constructor method
	public Product() {
		super();
	}
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	//setter getter method
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//to string method
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", getPid()=" + getPid()
				+ ", getPname()=" + getPname() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	/*@Override
	public int compareTo(Product p) {
		if(pid == p.pid) {
			return 0;
		}
		else if(pid > p.pid) {
			return 1;
		}
		else {
			return -1;
		}
		
	}*/
	
	
		

}
