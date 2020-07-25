package com.epam.Prototype_Patterm;


public class Box_Prototype implements Cloneable{
	   private String color;

	   public Box_Prototype(String col){
	      setColor(col);
	   }

	   public Box_Prototype clone(){
	      Box_Prototype b=null;
	      try{
	         b=(Box_Prototype)super.clone();
	      }catch(Exception e){

	      }
	      return b;
	   }

	   public String getColor() {
	      return color;
	   }

	   public void setColor(String color) {
	      this.color = color;
	   }
	}