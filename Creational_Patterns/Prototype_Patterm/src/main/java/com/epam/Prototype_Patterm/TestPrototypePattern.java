package com.epam.Prototype_Patterm;

public class TestPrototypePattern {
	 public static void main(String[] args) {
	      Box_Prototype box1=new Box_Prototype("GREEN");
	      Box_Prototype box2=box1.clone();
	      System.out.println("BOX 1: "+box1.getColor());
	      System.out.println("BOX 2: "+box2.getColor());
	      box2.setColor("BLUE");
	      System.out.println("BOX 2: "+box2.getColor());
	   }
}