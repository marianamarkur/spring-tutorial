package com.caveofprogramming.spring.test;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	public void onCreate() {
		System.out.println("Person created " + this);
	}
	
	public void onDestroy() {
		System.out.println("Person destroyed.");
	}
	
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void speak() {
		System.out.println("I am a person!");
	}
	
	public Person() {
		
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static Person getInstance(int id, String name) {
		System.out.println("Creating Person Instance");
		return new Person(1234, "Bob");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}
}
