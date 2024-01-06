import java.util.*; 
public class PigTranslator {
// Pig Latin is a language or language game. 
// Here are the steps with any word. 
// First, move the first consonant or consonant cluster to the end of the word.
//  Second, add “ay” to the end of the word. 
// For example, the word “banana” would become “ananabay.”
// Write a method in Java that turns a string that contains words into the equivalent in Pig Latin.


    public static String translatePigLatin(String str){
        // String [] letters = str.split("(?!^)");
        String pigString="";
        String consonants="";
        boolean firstConsonant=false;
        boolean firstVowel=false;
        str= str.toLowerCase();
        for (int i=0;i<str.length();i++){
           if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            // System.out.println(str.charAt(i)+"---");
            firstVowel=true; 
            pigString+=str.charAt(i);
           }
           else if (!firstVowel&&(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')){
            firstConsonant=true;
            consonants+=str.charAt(i);
           }

           if(firstConsonant && firstVowel&&(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')){
            pigString +=str.charAt(i);
           }
           

        // A U S T R L I A
        // B A N A N A  -->  A N A N A B A Y
           
        }
        pigString +=consonants;
        pigString +="ay";
        return pigString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str = sc.nextLine();
        System.out.println("The Latin Pig String is : "+translatePigLatin(str)); 
        sc.close();       
    }
    
}
