package Learning.UpcastingAndDowncasting;

public class Farm {
    public static void main(String[] args) {
        // Upcasting
        Animal genericAnimal = new Cow("Bessie");
        genericAnimal.makeSound(); // Polymorphic behavior

        // Downcasting
        if (genericAnimal instanceof Cow) {
            Cow specificCow = (Cow) genericAnimal;
            specificCow.graze(); // Accessing Cow-specific method
        }

        // Creating a Sheep and upcasting
        Animal anotherAnimal = new Sheep("Dolly");
        anotherAnimal.makeSound();

        // Attempting downcasting (may result in a runtime exception)
        // Uncommenting the following line will result in a ClassCastException
        // Sheep anotherSheep = (Sheep) anotherAnimal;
    }
}