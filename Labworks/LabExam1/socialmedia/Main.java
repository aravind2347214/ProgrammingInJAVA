package Labworks.LabExam1.socialmedia;
public class Main {
    public static void main(String[] args) {
        RegularUser ru1 = new RegularUser("ru-11", "Sam", "sam@gmail.com");
        RegularUser ru2 = new RegularUser("ru-22", "Jimmy", "jimmy@gmail.com");

        AdminUser au1 = new AdminUser("au-11", "Tim", "tim@gmail.com", "can update and delete posts");
        
        ru1.createPost("Myself " +ru1.getName()+" I run a farm in a rural area and im very \n exicited to  share that a new calf was born in the farm");
        ru2.createPost("Myself " +ru2.getName()+" I manage a law firm and im thrilled to \n announce that i have many clients this financial year");


        ru1.displayProfile();
        System.out.println("\n");

        System.out.println("Post By "+ru1.getName()+" :\n");
        ru1.displayPost("PostID-"+ru1.getID());

        System.out.println("\n");

        ru2.displayProfile();
        System.out.println("\n");

        System.out.println("Post By "+ru2.getName()+" :\n");
        ru2.displayPost("PostID-"+ru2.getID());



        System.out.println("\n");
        au1.displayProfile();
        System.out.println("\n");
    }
    
}
