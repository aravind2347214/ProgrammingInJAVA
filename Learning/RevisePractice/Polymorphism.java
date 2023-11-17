package Learning.RevisePractice;
    // Demonstrate Compile time Polymorphism and Run-time Polymorphism.
public class Polymorphism {
    
    public static class Vehicle {

        public void run(){
            System.out.println("Vehicle is running");
        }
    }

    public static class Bike extends Vehicle{

        public void run(){
            System.out.println("Bike is running");
        }

        public void showVehicle(){
            System.out.println("Bike is shown");
        }
        public void showVehicle(int i){
            System.out.println("Bike is shown with "+ i +" Variable");
        }

    }


    public static void main(String[] args) {

        Bike b1 = new Bike();
        Vehicle v2 = new Vehicle();
        b1.run();
        v2.run();
        b1.showVehicle();
        b1.showVehicle(4);


        
    }

    
}
