package Labworks.LabEx3;

public class Farm {
    public static void main(String[] args) {
        Cow bessie = new Cow("Bessie");
        Sheep dolly = new Sheep("Dolly");

        bessie.makeSound();
        bessie.graze();

        dolly.makeSound();
    }
}