package Learning.RevisePractice;

public class Question12 {
    public static void main(String[] args) {
        Short s1= 200;
        Integer s2 = 400;
        Long s3 = (long) s1+s2;
        String s4 = (String)(s3*s2);
        System.out.println("Sum is "+ s4);
        // Output Compilation is Fails at line 2 for making s4
    }
    
}
