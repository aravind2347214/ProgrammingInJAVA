package Labworks.LabEx4;
import Labworks.LabEx4.Animals.*;
import Labworks.LabEx4.InAnimateObjects.*;

public class Farm {
    public static void main(String[] args) {
        Cow bessie = new Cow("Bessie",4,12.5);
        Sheep dolly = new Sheep("Dolly",2,4.5);
        Tractor Charlie = new Tractor("Charlie",30);
        Scarecrow Malcom = new Scarecrow("Malcom",30);

        System.out.println("\n----FARM----");

        System.out.println("\nAbout Our Cow ");
        bessie.move();
        bessie.makeNoise();
        bessie.feed();

        System.out.println("\nAbout Our Sheep ");
        dolly.move();
        dolly.makeNoise();
        dolly.feed();

        System.out.println("\nAbout Our Tractor ");
        Charlie.move();
        Charlie.makeNoise();

        System.out.println("\nAbout Our Scarecrow ");
        Malcom.makeNoise();

        System.out.println("\n");
    }

    
}