package Labworks.LabEx21;
import java.util.*;
public class StringManipulation {

    public static String textString ="We realizes that while our workers were thriving, the\r\n" + 
            "surrounding villages were still suffering. It became our goal to uplift their\r\n" + 
            "quality of life as well. I remember seeing a family of 4 on a motorbike in the\r\n" + 
            "heavy Bombay rain — I knew I wanted to do more for these families who were\r\n" + 
            "risking their lives for lack of an alternative” The alternative mentioned here\r\n" + 
            "is the Tata Nano, which soon after came as the world’s cheapest car on retail\r\n" + 
            "at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a\r\n" + 
            "recent post by Humans of Bombay which formed the basis of his decision to come\r\n" + 
            "up with a car like Tata Nano.";
    
    public static String newTextString="We realizes that while our workers were thriving, the\r\n" + 
            "surrounding villages were still suffering. It became our goal to uplift their\r\n" + 
            "quality of life as well. I remember seeing a family of 4 on a motorbike in the\r\n" + 
            "heavy Bombay rain — I knew I wanted to do more for these families who were\r\n" + 
            "risking their lives for lack of an alternative” The alternative mentioned here\r\n" + 
            "is the Tata Nano, which soon after came as the world’s cheapest car on retail\r\n" + 
            "at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a\r\n" + 
            "recent post by Humans of Bombay which formed the basis of his decision to come\r\n" + 
            "up with a car like Tata Nano.";
    public static char charray[];
    public static void main(String[] args) {

        System.out.println("String is :\n "+textString);

        System.out.println("\ntextString equals newTextString : "+textString.equals(newTextString));
        System.out.println("\ntextString compareTo newTextString : "+textString.compareTo(newTextString));
        System.out.println("\ntextString == newTextString : "+textString==newTextString);
        System.out.println("\nLength of String textString  : "+textString.length());
        charray = textString.toCharArray();
        //  print the charrray
        System.out.print("Character array of string by toCharArray: ");
        for (int i=0 ;i<charray.length;i++)
        {
                if(i%50==0){System.out.println();}
                else{System.out.print(charray[i]+"\t");}
        }
        System.out.println("\nCharAt method at index 3 : "+textString.charAt(3));
        System.out.println("\nSubstring Method from 4 to 7 : "+textString.substring(4,7));
        System.out.println("\nIndexOf Method of  'a' : "+textString.indexOf('a'));
        System.out.println("\nLast Index Of Method of 'a' : "+textString.lastIndexOf('a'));
        System.out.println("\nReplace Method a with z : "+textString.replace('a', 'z'));
        System.out.println("\nReplaceAll Method a with y : "+textString.replace('a', 'y'));
        System.out.println("\nSplit Method based on 'gu' : "+textString.split("gu"));
        System.out.println("\nTrim Method on textString : "+textString.trim());
        System.out.println("\ntoLowerCase Method : "+textString.toLowerCase());
        System.out.println("\ntoUpperCase Method : "+textString.toUpperCase());
        System.out.println("\nIntern Method : "+textString.intern()+" , "+newTextString.intern());
        System.out.println("\nConcat Method : "+textString+newTextString);   
        System.out.println("\nValueOf Method : "+Integer.toString(5)+" , "+Double.toString(6.89));
        System.out.println("\nGetBytes Method : "+new String("Hello").getBytes().toString());
        // example for valueof in java
        System.out.println("\nValueof Method : "+String.valueOf("ksdjfn"));
        System.out.println("\nFormat Method : "+String.format("%d %f", 10, 20.5));
        System.out.println("\nJoin Method : "+String.join(", ", "Apple","Mango","Grapes"));
        System.out.println("\nRepeat Method : "+textString.repeat(5));
        System.out.println("\nIsEmpty Method : "+textString.isEmpty());
        System.out.println("\nContains Method : "+textString.contains("Java"));
        System.out.println("\nStartsWith Method : "+textString.startsWith("Jav"));
        System.out.println("\nEndsWith Method : "+textString.endsWith("java"));
        System.out.println("\nEqualsIgnore Case Method : "+textString.equalsIgnoreCase("bUbBlEgUm"));
        textString.getChars(10,30,charray,0);
        String str = new String(charray);
        System.out.println("\nGetChar Method a with textString : "+str);

       
    }

    
}