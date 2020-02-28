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
public class Pet_2 {

    private String name;
    private int age; //in years
    private double weight;//in pounds

    public Pet_2(String initialName, int initialAge,
            double initialWeight) {
        set(initialName, initialAge, initialWeight);
    }

    public Pet_2(String initialName) {
        set(initialName, 0, 0);
    }

    public Pet_2(int initialAge) {
        set("No name yet.", initialAge, 0);
    }

    public Pet_2(double initialWeight) {
        set("No name yet.", 0, initialWeight);
    }

    public Pet_2() {
        set("No name yet.", 0, 0);
    }

    public void setPet(String newName, int newAge,
            double newWeight) {
        set(newName, newAge, newWeight);
    }

    public void setName(String newName) {
        set(newName, age, weight);//age and weight unchanged
    }

    public void setAge(int newAge) {
        set(name, newAge, weight);//name and weight unchanged
    }

    public void setWeight(double newWeight) {
        set(name, age, newWeight);//name and age unchanged
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
//<The methods getName, getAge, getWeight, and writeOutput
//are the same as in Listing 6.1.>
}
