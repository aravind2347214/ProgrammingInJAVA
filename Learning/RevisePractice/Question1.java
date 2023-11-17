package Learning.RevisePractice;
// Write a Java program to display the time in human readable format like,
// hours:minutes:seconds.
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Question1 {
    public static void main(String[] args) {
               // Get the current local time
               LocalTime currentTime = LocalTime.now();

               System.out.println(LocalTime.now());

               // Define a formatter for the desired output format
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
       
               // Format the current time using the formatter
               String formattedTime = currentTime.format(formatter);
       
               // Print the formatted time
               System.out.println("Current time is: " + formattedTime);

    }
    
}
