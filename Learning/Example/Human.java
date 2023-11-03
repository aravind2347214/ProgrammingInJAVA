package Learning.Example;

public class Human {

 public static void main(String[] args) {
    InnerHuman h1 = new InnerHuman();
    InnerHuman h2 = new InnerHuman(25);
    InnerHuman h3 = new InnerHuman("Sam");
    InnerHuman h4 = new InnerHuman("Tom",32);
    InnerHuman h5 = new InnerHuman(h4);   
    }
    
}
