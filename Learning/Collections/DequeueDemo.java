package Learning.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque<Integer> browserHistory= new ArrayDeque<>();
        browserHistory.addFirst(5);
        browserHistory.addFirst(6);
        browserHistory.addFirst(3);
        browserHistory.addFirst(9);
        System.out.println("Browser History: "+browserHistory);
        //Removing elements from the front of the dequeue using removeFirst() method
        browserHistory.removeFirst();//removes 9
        System.out.println("\nAfter removing element at the front, Browser History: "+ browserHistory);
        //Adding an element to the back of the queue using addLast() method
        browserHistory.addLast(10);
        System.out.println("\nAfter adding 10 to the end, Browser History:\n"+browserHistory+"\n");
        //Removing elements from the rear/end of the dequeue using removeLast() method
        browserHistory.removeLast();//removes 10
        System.out.println("After removing last element, Browser History:\n"+browserHistory);

    }

}
