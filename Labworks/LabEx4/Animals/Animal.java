package Labworks.LabEx4.Animals;

public abstract class Animal {
    private String name;
    public int age;


    public Animal(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

   abstract public void Production();
}