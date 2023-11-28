package Labworks.LabEx4.Animals;
import Labworks.LabEx4.Interfaces.*;

public class Sheep extends Animal implements Movable, Noisy, Feedable {
    public double woolGiven;

    public Sheep(String name,int age,double woolGiven) {
        super(name,age);
        this.woolGiven =woolGiven;
    }

    @Override
    public void move() {
        System.out.println(getName() + " is happily walking around.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Baa! I'm a fluffy sheep named " + getName()+" And i give "+this.woolGiven+"kg of wool per year");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is enjoying some tasty grass for the past "+this.age+" years");
    }

    @Override
    public void Production(){
        System.out.println(getName() + " produces "+this.woolGiven+" a year");
    }
}