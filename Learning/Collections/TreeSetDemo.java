package Learning.Collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet <String> plants = new TreeSet<>(); 
        plants.add("Banana");
        plants.add("Apple Tree");
        plants.add("Mango Tree");

        System.out.println("All Plants : "+plants);
        // Remove Plant 
        plants.remove("Banana");
        System.out.println("\nPlant removed: Banana" + "\nRemainingPlants : " + plants);


    }
    
}
