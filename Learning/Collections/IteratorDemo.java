package Learning.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // Illustrate the example for Iterator in the variable colors using Arraylist
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println("\nUsing a while loop: ");
        int i = 0;
        while (i < colors.size()) {
            String color = colors.get(i);
            System.out.print(color + " ");
            i++;
        }
        System.out.println("");
        System.out.println("\nUsing an iterator to print all elements of ArrayList");
        Iterator<String> colorIter = colors.iterator();
        while (colorIter.hasNext()) {
            String element = colorIter.next();
            System.out.print(element + " ");
        }
        System.out.println("\n\nUsing ListIterator to modify elements of ArrayList by calling next() and set()...");
    }
}
