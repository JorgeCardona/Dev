package com.project.classes;

import java.util.Date;

public class ProgrammingLanguages {
	
	private int id;
	private String name;
	private double popularity;
	private int rating;
	private Date date;
	
	public ProgrammingLanguages() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ProgrammingLanguages(int id, String name, double popularity, int rating, Date date) {
		this.id = id;
		this.name = name;
		this.popularity = popularity;
		this.rating = rating;
		this.date = date;
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
	 * @return the popularity
	 */
	public double getPopularity() {
		return popularity;
	}
	/**
	 * @param popularity the popularity to set
	 */
	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
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
