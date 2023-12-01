package Labworks.LabEx4.InAnimateObjects;
import Labworks.LabEx4.Interfaces.Noisy;

public class Scarecrow implements Noisy {
    public String name;
    public int AvgCrows;

    public Scarecrow(String name,int AvgCrows){
        this.name = name;
        this.AvgCrows=AvgCrows;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name+" The Scarecrow scaring "+this.AvgCrows+"crows a day");
    }
}