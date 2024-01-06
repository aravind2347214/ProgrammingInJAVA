package Learning.Collections;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> contacts = new TreeMap<>();
        contacts.put("Smith", "7895842687");
        contacts.put("Johnson","3458790123");
        System.out.println("Initial Map: "+contacts);
        // Get the value for a key using get() method
        String phoneNumber = contacts.get("Johnson");
        System.out.println("\nPhone Number of Johnson is :"+phoneNumber);
    }
    
}
