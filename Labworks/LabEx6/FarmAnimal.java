package Labworks.LabEx6;

// Generic FarmAnimal class
public class FarmAnimal<T> {
    private String name;
    private T attribute;

    public FarmAnimal(String name, T attribute) {
        this.name = name;
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public T getAttribute() {
        return attribute;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
