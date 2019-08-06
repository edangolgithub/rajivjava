package com.google;

public class Vehicle 
{
 String model;
 private double price;
 public String country;
 
 // state properties attributes fields
 //behaviour function method
  Engine engine;
 
 public Vehicle()
 {
	 System.out.println("constructor called");
 }
 public Vehicle(String model,double price, String country)
 {
	 this.model=model;
	 this.price=price;
	 this.country=country;
	 System.out.println("constructor2 called");
 }
 
 public void start()
 {
	 System.out.println(model+ " started");
 }
 private void stop()
 {
	 System.out.println(model+ " stopped");
 }
public void brake()
 {
	System.out.println(model+ " braked");
	 stop();
	 
 }
 //public private protected
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


 
}
