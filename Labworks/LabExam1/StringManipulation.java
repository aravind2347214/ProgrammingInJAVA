package Labworks.LabExam1;
import java.util.Scanner;


public class StringManipulation {

    public static void manipulateString(String inputString){
        // find the vowel count in the string
        int vowelCount=0;
        for (int i = 0; i <inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c=='a'||c=='e'||c=='o'||c=='u'||c=='i'){
                vowelCount++;}
            }
        System.out.println("The Number of Vowels is : "+ vowelCount);

        // Converts the input string to uppercase.
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Converted Upper Case String: " +upperCaseString );

        // Reverses the input string using StringBuffer.
        StringBuffer sbuffer = new StringBuffer(inputString);
        String reverseString = sbuffer.reverse().toString();
        System.out.println("Reverse String Using String Buffer: " + reverseString);
    }

    public static void main(String[] args) {
        // take user input string  using scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        // display the original string
        System.out.print("\nThe entered string is : " +inputString+ "\n");
        manipulateString(inputString);
        sc.close();  
    }
    
}
