package Learning.StringManip;

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
    }
}
