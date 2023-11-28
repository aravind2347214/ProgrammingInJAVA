package Labworks.LabEx4.Animals;
import Labworks.LabEx4.Interfaces.*;

public class Cow extends Animal implements Movable, Noisy, Feedable {

    public double milkPerday;

    public Cow(String name,int age,double milkPerday) {
        super(name,age);
        this.milkPerday = milkPerday;
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moo-ving gracefully.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Moo! I'm a happy cow named " + getName());
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is enjoying a delicious meal.");
    }

    @Override
    public void Production(){
        System.out.println(getName() + " produces "+this.milkPerday+" a day");
    }

    
}