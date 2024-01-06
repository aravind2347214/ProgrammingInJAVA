package Learning.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue <String> fruits = new LinkedList<String>();
        //add elements to the queue using add() method
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println(fruits);
        System.out.println("Removing first fruit");
        String removedFruit=fruits.remove();//removes and returns the element at
        System.out.print("First Element Removed : "+removedFruit);
        System.out.println("Next Element : "+fruits.peek());        
      
    }
    
}
