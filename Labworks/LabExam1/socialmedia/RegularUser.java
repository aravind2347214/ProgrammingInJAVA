package Labworks.LabExam1.socialmedia;
import java.util.ArrayList;
public class RegularUser extends User implements Post {
    ArrayList<String> postList;

    public RegularUser(String userId, String userName, String email) {
        super(userId, userName, email);
        this.postList = new ArrayList<>();
    }

    @Override
    public void displayProfile() {
        System.out.println("Regular User Profile:");
        System.out.println("User ID: " + this.getID());
        System.out.println("Username: " + this.getName());
        System.out.println("Email: " + this.getEmail());
    }

    public String createPost(String content){
        String postId = "PostID-" + this.getID() ;
        String postContent = postId+" : "+content;
        postList.add(postContent);
        return postId;
    }

    public void displayPost(String postId){
        boolean postfound = false;
        // loop through postlist and display the post containig the postid
            for (String str : postList) {
                if (str.startsWith(postId)) {
                    postfound = true;
                    System.out.println(str);
                    }
                }

        if(!postfound){
            System.out.println("No such post found!");
        }
    
    }
   
}
