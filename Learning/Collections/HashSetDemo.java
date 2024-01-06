package Learning.Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Implement hash set with the the variable colors
        HashSet<String> colors = new HashSet<>();
        // Add elements to the hashset using add() method
        colors.add("Red");
        colors.add("Blue");
        System.out.println("Colors Set: " + colors);
        // Checking if a color is present in the set or not by using contains()
        boolean isGreenPresent = colors.contains("Green");
        System.out.println("Is Green Present? : " + isGreenPresent);
        // Adding an element that already exists in the set, it will not be added again
        colors.add("Red");
        System.out.println("After adding Red again: " + colors);
        // Removing an element from the set using remove() method
        colors.remove("Blue");
        System.out.println("After removing Blue: " + colors);
        // Using size() method to get number of elements in the set
        int noOfElements = colors.size();
        System.out.println("Number of Elements in Colors Set: " + noOfElements
        + ". Since there are only 1 unique colors but Blue was removed, so answer should be 1.");
    }
    
}
