package Labworks.LabExam1.socialmedia;
public abstract class User {
    String userId;
    String userName;
    String email;

    String getName(){
        return this.userName;
    }
     String getID(){
        return this.userId;
    }
     String getEmail(){
        return this.email;
    }

    User(String userId,String userName,String email){
        this.userId = userId;
        this.userName= userName;
        this.email = email;
    }
    public abstract void displayProfile();
 
}
