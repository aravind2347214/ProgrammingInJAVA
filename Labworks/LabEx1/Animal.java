package Labworks.LabEx1;

public class Animal {
    private String name;
    private int age;
    Animal(){
        this("", 0); // default constructor
    }
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    } 
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
