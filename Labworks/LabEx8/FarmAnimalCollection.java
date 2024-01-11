package Labworks.LabEx8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FarmAnimalCollection {
    public static void main(String[] args) {
        // Using ArrayList to manage a list of farm animals
        List<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(new FarmAnimal("Bessie", 4));
        farmAnimals.add(new FarmAnimal("Fluffy", 4));
        farmAnimals.add(new FarmAnimal("Spot", 4));

        System.out.println("List of Farm Animals:");
        for (FarmAnimal animal : farmAnimals) {
            System.out.println(animal.getName());
        }

        // Using HashMap to manage information about farm tasks
        Map<String, String> farmTasks = new HashMap<>();
        farmTasks.put("Feeding", "Provide food to animals");
        farmTasks.put("Shearing", "Remove wool from sheep");

        System.out.println("\nFarm Tasks and Descriptions:");
        for (Map.Entry<String, String> entry : farmTasks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using LinkedList to manage the order of farm tasks
        LinkedList<String> taskOrder = new LinkedList<>();
        taskOrder.add("Feeding");
        taskOrder.add("Shearing");

        System.out.println("\nOrder of Farm Tasks:");
        for (String task : taskOrder) {
            System.out.println(task);
        }
    }
}