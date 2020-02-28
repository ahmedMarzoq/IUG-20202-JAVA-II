/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimensionconverterdemo;

import java.util.Scanner;

/**
 *
 * @author Flash Tech
 */
public class DimensionConverterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a measurement in inches: ");
        double inches = keyboard.nextDouble();
        double feet = DimensionConverter.convertInchesToFeet(inches);
        System.out.println(inches + " inches = "
                + feet + " feet.");
        System.out.print("Enter a measurement in feet: ");
        feet = keyboard.nextDouble();
        inches = DimensionConverter.convertFeetToInches(feet);
        System.out.println(feet + " feet = "
                + inches + " inches.");
    }

}
