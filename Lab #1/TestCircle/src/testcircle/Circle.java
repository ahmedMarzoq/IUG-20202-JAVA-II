/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

/**
 *
 * @author Flash Tech
 */
public class Circle {
     // Private instance variables
   private double radius;
   private String color;
   
   
   // Constructors (overloaded)
   public Circle() {                   // 1st Constructor (default constructor)
      radius = 1.0;
      color = "red";
   }
   public Circle(double r) {           // 2nd Constructor
      radius = r;
      color = "red";
   }
   public Circle(double r, String c) { // 3rd Constructor
      radius = r;
      color = c;
   }
   
   public void setRadius(double r)
   {
       radius = r;
   }
   
   public void setColor(String color){
       this.color = color;
   }
   // Public methods
   public double getRadius() {  // getter for radius
      return radius;
   }
   public String getColor() {   // getter for color
      return color;
   }
   
   public double getArea() {
      return radius * radius * Math.PI;
   }
}
