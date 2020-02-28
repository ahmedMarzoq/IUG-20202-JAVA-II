/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petdemo;

/**
 *
 * @author Flash Tech
 */
public class Pet_3 {

    private String name;
    private int age; //in years
    private double weight;//in pounds

    public Pet_3(String initialName, int initialAge,
            double initialWeight) {
        set(initialName, initialAge, initialWeight);
    }

    public Pet_3(String initialName) {
        this(initialName, 0, 0);
    }

    public Pet_3(int initialAge) {
        this("No name yet.", initialAge, 0);
    }

    public Pet_3(double initialWeight) {
        this("No name yet.", 0, initialWeight);
    }

    public Pet_3() {
        this("No name yet.", 0, 0);
    }

    private void set(String newName, int newAge,
            double newWeight) {
        name = newName;
        if ((newAge < 0) || (newWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
        }
    }
}
