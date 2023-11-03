package Learning.Example;

public class InnerHuman {
    private String name;
    private int age;

    //  Constructor with No parameter
    InnerHuman(){
        System.out.println("\nDefault Constructor");
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);

    }

    // Constructor with String Attribute
    InnerHuman(String name){
        this.name=name;
        System.out.println("\nConstructor with String Argument");
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
    }

    // Constructor with Integer
    InnerHuman(int age){
        this.age=age;
        System.out.println("\nConstructor with Integer Argument");
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
    }

    // Constructor with both data members as argumments
    InnerHuman(String name,int age){
        this.age=age;
        this.name=name;
        System.out.println("\nConstructor with Both Argument");
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
    }
    
    // Copy Constructor
    InnerHuman(InnerHuman tempHuman){
        this.name =tempHuman.name;
        this.age= tempHuman.age;
        System.out.println("\nCopy Constructor with Object Argument");
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
    }
   
}
