package dogdemo;

public class DogDemo {

    public static void main(String[] args) {
        
        Dog balto = new Dog(); // New Object
        
        balto.name = "Balto";
        balto.age = 8;
        balto.breed = "Siberian Husky";
        balto.writeOutput();
        
        Dog scooby = new Dog();// New Object
        
        scooby.name = "Scooby";
        scooby.age = 42;
        scooby.breed = "Great Dane";
        System.out.println(scooby.name + " is a "
                + scooby.breed + ".");
        System.out.println("He is " + scooby.age
                + " years old, or "+scooby.getAgeInHumanYears()+ " in human years.");
    }

}
