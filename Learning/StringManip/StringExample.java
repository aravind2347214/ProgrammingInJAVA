package Learning.StringManip;
import java.util.*;
public class StringExample {
    public static void main(String[] args) {
        String s1 = "Bubblegum";
        char ch[]={'B','u','b','b','l','e','g','u','m'};
        String s2 = new String(ch);
        String s3 = new String("Bubblegum");
        System.out.println("S1 : "+s1);
        System.out.println("S2 : "+s2);
        System.out.println("S3 : "+s3);
        System.out.println("S1 == S2 : "+s1==s2);
        System.out.println("S1 equals S2 : "+s1.equals(s2));
        System.out.println("S1 compareTo S2 : "+s1.compareTo(s2));
        System.out.println("S1 == S3 : "+s1==s3);
        System.out.println("S1 equals S3 : "+s1.equals(s3));
        System.out.println("S1 compareTo S3 : "+s1.compareTo(s3));
        System.out.println("S2 == S3 : "+s2==s3);
        System.out.println("S2 equals S3 : "+s2.equals(s3));
        System.out.println("S2 compareTo S3 :"+s2.compareTo(s3));
        System.out.println("Length of String S3  : "+s3.length());
        System.out.println("CharAt method : "+s3.charAt(3));
        System.out.println("Substring Method : "+s3.substring(4,7));
        System.out.println("IndexOf Method : "+s3.indexOf('a'));
        System.out.println("Last Index Of Method : "+s3.lastIndexOf('a'));
        System.out.println("Replace Method : "+s3.replace('a', 'z'));
        System.out.println("Split Method : "+s3.split("gu"));
        System.out.println("Trim Method : "+s3.trim());
        System.out.println("toLowerCase Method : "+s3.toLowerCase());
        System.out.println("toUpperCase Method : "+s3.toUpperCase());
        System.out.println("Intern Method : "+s1.intern()+" , "+s2.intern());
        System.out.println("Concat Method : "+s1+s2);   
        System.out.println("ValueOf Method : "+Integer.toString(5)+" , "+Double.toString(6.89));
        System.out.println("GetBytes Method : "+new String("Hello").getBytes().toString());
        System.out.println("Valueof Method : "+String.valueOf(true));
        System.out.println("Format Method : "+String.format("%d %f", 10, 20.5));
        System.out.println("CopyValueOf Method : "+String.copyValueOf(ch, 2, 4));
        System.out.println("Join Method : "+String.join(", ", "Apple","Mango","Grapes"));
        System.out.println("Repeat Method : "+s3.repeat(5));
        System.out.println("IsEmpty Method : "+s3.isEmpty());
        System.out.println("Contains Method : "+s2.contains("Java"));
        System.out.println("StartsWith Method : "+s1.startsWith("Jav"));
        System.out.println("EndsWith Method : "+s2.endsWith("java"));
        System.out.println("Matches Method : "+s3.matches("[A-Z]*"));
        System.out.println("EqualsIgnore Case Method : "+s2.equalsIgnoreCase("bUbBlEgUm"));
        System.out.println("Region Matches Method : "+s1.regionMatches(0,s2,0,s2.length()));
        System.out.println("Compare To Ignore Case Method : "+s1.compareToIgnoreCase(s2));
        System.out.println("Offset By Code Points Method : "+Character.offsetByCodePoints(s3, 0, 5));
        System.out.println("Code Point At Method : "+Character.codePointAt(s3, 0));
        System.out.println("Code Point Before Method : "+Character.codePointBefore(s3, 4));
        System.out.println("Code Point Count Method : "+Character.codePointCount(s3, 0, s3.length()));
        System.out.println("Chars Method : "+Arrays.toString(s3.chars().toArray()));
        // System.out.println("Code Units Method : "+Arrays.toString(s3.codePoints().boxed().toArray()));



        

       


       


    }
}
