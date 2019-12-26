package com.deepankar.donor;

import javax.persistence.*;


@Entity
@Table(name = "donor")
public class Donor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "phoneNumber")
	private int phoneNumber;
	@Column(name = "bloodGroup")
	private String bloodGroup;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
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
	
	
	public Donor(long id, String name, int phoneNumber, String bloodGroup, String city, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.bloodGroup = bloodGroup;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public Donor() {
		super();
	}
	
	
	
	//Setters, getters and constructors
	
	}

