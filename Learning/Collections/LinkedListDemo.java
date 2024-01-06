package Learning.Collections;

import java.util.LinkedList; 

public class LinkedListDemo {

    public static void printList(LinkedList<String> colors){
        System.out.print("[ ");
        for (Object color : colors) {
            System.out.print(color + " ");
            }
        System.out.print(" ]");


    }
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add( "Red");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Adding elements: ");
        printList(colors);
        // Removing an element using remove() method
        System.out.println("\nRemoving 'Blue' from the list: ");
        colors.remove("Blue");
        printList(colors);
        // Adding an element at a specific position using add() method with index as parameter
        System.out.println("\nAdding 'Green' at second position: ");
        colors.add(1, "Green");
        printList(colors);

    }
    
}
