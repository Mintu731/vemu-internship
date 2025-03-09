package com.vehical;

class Vehicle {
    private String brand;
    private int year;
    private int price;
    
    public Vehicle(String brand, int year, int price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", year=" + year + ", price=" + price + "]";
	}
   
}