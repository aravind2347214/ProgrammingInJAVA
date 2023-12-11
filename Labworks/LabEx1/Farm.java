package Labworks.LabEx1;

public class Farm {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        Cow c2 = new Cow("Charlie", 3, "Belgian Blue");
        c2.setCowDetails(9, 2, 5);
        System.out.println("\n---- Activities "+c2.getName()+" did ----");
        c2.doWork();
        c2.doWork(6.5);
        c2.doWork(5);
        System.out.println("------------------------\n");
        c2.showCowDetails();
        System.out.println("\n");
        c1.showCowDetails();
    }   
}