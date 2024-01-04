package Labworks.LabEx7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating farm animals
        Animal cow = new Animal("Bessie", 4);
        Animal hen = new Animal("Fluffy", 2);

        // Creating a list of farm animals
        List<Animal> Animals = new ArrayList<>();
        Animals.add(cow);
        Animals.add(hen);

        // Creating a FarmManager
        FarmManager farmManager = new FarmManager(Animals);

        // Using lambda expression to define a feeding task
        FarmTask feedTask = item -> System.out.println("Feeding " + item.getName());

        // Performing tasks on the farm using lambda expression
        farmManager.performTasks(feedTask);

        // Using lambda expression to define a counting legs task
        FarmTask countLegsTask = item -> System.out.println(item.getName() + " has " + item.getLegs() + " legs.");

        // Performing counting legs tasks on the farm using lambda expression
        farmManager.performTasks(countLegsTask);

    }
    
}
