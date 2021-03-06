package com.gqltest.model;

public class Address {

	private int aptNumber;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String country;
	
	public Address(int aptNumber, String street1, String street2, String city, String state, String country) {
		super();
		this.aptNumber = aptNumber;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	
	public int getAptNumber() {
		return aptNumber;
	}
	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
