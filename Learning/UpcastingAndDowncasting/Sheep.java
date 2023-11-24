package Learning.UpcastingAndDowncasting;

class Sheep extends Animal {
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Baa! I'm a fluffy sheep named " + getName());
    }
}
