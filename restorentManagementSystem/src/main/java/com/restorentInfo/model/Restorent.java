package com.restorentInfo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Restorent 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String best;
	@Column
	private double rating;
	
	public Restorent() 
	{
		
	}

	public Restorent(String name, String address, String best, double rating) {
		super();
		this.name = name;
		this.address = address;
		this.best = best;
		this.rating = rating;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBest() {
		return best;
	}

	public void setBest(String best) {
		this.best = best;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
}
