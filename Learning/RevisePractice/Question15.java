package Learning.RevisePractice;

public class Question15 {
public static void main(String[] args)
{

try {
    Integer i = new Integer(1) + new Integer(2);
    switch(i)
    {
    case 3: System.out.println("three"); break;
    default: System.out.println("other"); break;
    }
    
} catch (Exception e) {
    // TODO: handle exception
    System.out.println("Error!");
    
}
}
    
}
