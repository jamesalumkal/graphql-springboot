package com.gqltest.model;

public class Person {

	private String pid;
	private String name;
	private int age;
	private Address address;
	
	public Person(String pid, String name, int age, Address address) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
