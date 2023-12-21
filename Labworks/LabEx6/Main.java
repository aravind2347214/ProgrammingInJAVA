package Labworks.LabEx6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating farm animals
        FarmAnimal<Integer> cow = new FarmAnimal<>("Bessie", 4);
        FarmAnimal<Double> sheep = new FarmAnimal<>("Fluffy", 3.5);
        FarmAnimal<Integer> duck = new FarmAnimal<>("Timmy", 5);
        FarmAnimal<Double> geese = new FarmAnimal<>("Lily", 4.5);
        FarmAnimal<String> rabit = new FarmAnimal<>("Manuel", "Fluffyboy");

        // Creating a list of farm animals
        List<FarmAnimal<?>> farmAnimalsSet1 = Arrays.asList(cow, sheep);
        List<FarmAnimal<?>> farmAnimalsSet2 = Arrays.asList(duck, geese);
        List<FarmAnimal<?>> farmAnimalsSet3 = Arrays.asList(rabit);

        // Creating a FarmManager
        FarmManager<FarmAnimal<?>> farmManager1 = new FarmManager<>(farmAnimalsSet1);
        FarmManager<FarmAnimal<?>> farmManager2 = new FarmManager<>(farmAnimalsSet2);
        FarmManager<FarmAnimal<?>> farmManager3 = new FarmManager<>(farmAnimalsSet3);

        // Defining a task for the animals
        FarmTask<FarmAnimal<?>> feedTask = item -> System.out.println(" Feeding " + item.getName());
        FarmTask<FarmAnimal<?>> swimTask = item -> System.out.println(" Making "+item.getName()+" Swim");
        FarmTask<FarmAnimal<?>> hopTask = item -> System.out.println(" Looking after "+item.getName()+" Hopping around");

        // Performing tasks on the farm
        System.out.println("---Farming Tasks---");
        farmManager1.performTasks(feedTask);
        System.out.println(" ");
        farmManager2.performTasks(swimTask);
        System.out.println(" ");
        farmManager3.performTasks(hopTask);
        System.out.println("-------------------");
    }
    
}
