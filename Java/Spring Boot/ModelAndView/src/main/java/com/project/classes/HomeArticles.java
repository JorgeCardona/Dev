package com.project.classes;

import java.util.Date;

public class HomeArticles {
	
	private int id;
	private String name;
	private int price;
	private double version;
	private Date date;
	
	
	public HomeArticles(int id, String name, int price, double version, Date date) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.version = version;
		this.date = date;
	}

	public HomeArticles() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}


	/**
	 * @return the version
	 */
	public double getVersion() {
		return version;
	}


	/**
	 * @param version the version to set
	 */
	public void setVersion(double version) {
		this.version = version;
	}


	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	 
}
