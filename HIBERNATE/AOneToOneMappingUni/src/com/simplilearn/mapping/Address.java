package com.simplilearn.mapping;

import javax.persistence.*;

@Entity
@Table(name = "A_ADDRESS_DATA")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADDRESS_ID")
	int aid;
	
	@Column(name = "ADDRESS_STREET")
	String street;
	
	@Column(name = "ADDRESS_CITY")
	String city;
	
	@Column(name = "ADDRESS_STATE")
	String state;
	
	public Address() {
	}
	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public Address(int aid, String street, String city, String state) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
}
