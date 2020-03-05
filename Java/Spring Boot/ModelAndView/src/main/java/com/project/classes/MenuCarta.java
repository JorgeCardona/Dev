package com.project.classes;
public class MenuCarta {
 
     private String name;
     private Boolean vegetarian;
     private Integer calaries;
     private Type type;
     
     public MenuCarta() {
		// TODO Auto-generated constructor stub
	}

     public MenuCarta (String name, Boolean vegetarian, Integer calaries, Type type) {
          super();
          this.name = name;
          this.vegetarian = vegetarian;
          this.calaries = calaries;
          this.type = type;
     }
     
     
     public MenuCarta (String name, Boolean vegetarian, Integer calaries) {
         super();
         this.name = name;
         this.vegetarian = vegetarian;
         this.calaries = calaries;

    }
    
     
     public enum Type { MEAT, FISH, CHIKEN ,OTHER }

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
	 * @return the vegetarian
	 */
	public Boolean getVegetarian() {
		return vegetarian;
	}

	/**
	 * @param vegetarian the vegetarian to set
	 */
	public void setVegetarian(Boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	/**
	 * @return the calaries
	 */
	public Integer getCalaries() {
		return calaries;
	}

	/**
	 * @param calaries the calaries to set
	 */
	public void setCalaries(Integer calaries) {
		this.calaries = calaries;
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
}