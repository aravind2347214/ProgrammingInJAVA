package Learning.Collections;
public class ListIteratorDemo {
    public static void main(String[] args) {
        // An exaple for listIterator in the numbers
        java.util.List<Integer> nums = new java.util.ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println("Original ArrayList: " + nums);
        // Create a ListIterator object and call its methods
        java.util.ListIterator<Integer> iterator = nums.listIterator();
        System.out.println("\nAdding 4 to the beginning of the array");
        nums.add(0, 4);
        System.out.println("Updated ArrayList after adding 4 at the beginning: " +nums);
        iterator = nums.listIterator();

        // Now we will use previous(), hasPrevious(), and set() method
        int count = 0;
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (count == 0) {
                iterator.set(number * 2);
                System.out.println("The element at index 1 is now doubled.");
            }
            System.out.println("Element at index " + count + ": " + number);
            count++;
        }
    }

}
