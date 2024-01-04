package Labworks.LabEx7;

// Animal class without generics
class Animal {
    private String name;
    private int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}