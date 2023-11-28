package Labworks.LabEx4.InAnimateObjects;
import Labworks.LabEx4.Interfaces.*;

public class Tractor implements Movable, Noisy {

    String name;
    int speed;

    public Tractor(String name,int speed){
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println(this.name +" The tractor is plowing the field.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Vroom! The tractor is at work.Engine Noise Rumbling. Goin at a Speed of "+this.speed+"km/h");
    }
}