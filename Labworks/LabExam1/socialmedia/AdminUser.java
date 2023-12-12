package Labworks.LabExam1.socialmedia;
public class AdminUser extends User {
    String permissions;

    AdminUser(String userId,String userName,String email,String permissions){
        super(userId, userName, email);
        this.permissions = permissions;
    }

    public void displayProfile(){
        System.out.println("Admin User Profile:");
        System.out.println("User ID: " + this.getID());
        System.out.println("Username: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Permissions: " + this.permissions);
    }

}
