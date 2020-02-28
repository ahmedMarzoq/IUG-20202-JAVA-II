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
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Declare and Construct an instance of the Circle class called c1
      Circle c1 = new Circle(2.0, "blue");  // Use 3rd constructor
      System.out.println("The radius is: " + c1.getRadius());  // use dot operator to invoke member methods
      //The radius is: 2.0
      System.out.println("The color is: " + c1.getColor());
      //The color is: blue
      System.out.println("The area is: "+ c1.getArea());
      //The area is: 12.57

      // Declare and Construct another instance of the Circle class called c2
      Circle c2 = new Circle(2.0);  // Use 2nd constructor
      System.out.println("The radius is: " + c2.getRadius());
      //The radius is: 2.0
      System.out.println("The color is: " + c2.getColor());
      //The color is: red
      System.out.printf("The area is: %.2f%n", c2.getArea());
      //The area is: 12.57

      // Declare and Construct yet another instance of the Circle class called c3
      Circle c3 = new Circle();  // Use 1st constructor
      System.out.println("The radius is: " + c3.getRadius());
      //The radius is: 1.0
      System.out.println("The color is: " + c3.getColor());
      //The color is: red
      System.out.printf("The area is: %.2f%n", c3.getArea());
      //The area is: 3.14
    }
    
}
