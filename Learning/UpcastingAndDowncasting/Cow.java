package Learning.UpcastingAndDowncasting;

class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo! I'm a happy cow named " + getName());
    }

    // Final method to prevent further override
    public final void graze() {
        System.out.println(getName() + " is grazing in the field.");
    }
}
