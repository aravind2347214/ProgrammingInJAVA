package Labworks.LabEx8;
class FarmAnimal {
    private String name;
    private int legs;

    public FarmAnimal(String name, int legs) {
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
