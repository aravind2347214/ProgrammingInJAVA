package Labworks.LabEx1;

public class Cow extends Animal {
    private double milkProducedPerDay;
    private String type;
    private int distanceWalkedPerDay;
    private int grassEatenPerDay;

    Cow(){
        super(); // Calling the constructor of the parent class (Animal)
        this.type ="Not Specified";
        this.distanceWalkedPerDay=0;
        this.grassEatenPerDay=0;
    }

    Cow(String name,int age,String type){
        super(name,age);
        this.type= type;
    }

    public void setCowDetails(double milkProducedPerDay,int distanceWalkedPerDay,int grassEatenPerDay){
        this.milkProducedPerDay = milkProducedPerDay;
        this.distanceWalkedPerDay = distanceWalkedPerDay;
        this.grassEatenPerDay = grassEatenPerDay;
    }

    public void doWork(){
        System.out.println(this.getName()+" Slept All Day In the Shelter");
    }

    public void doWork(int walked){
        System.out.println(this.getName()+" walked "+walked+ " KM " +" today" );
    }

    public void doWork(double milk){
        System.out.println(this.getName()+" gave "+milk+ " Liters " +" today" );
    }

    public void showCowDetails(){
        System.out.println("+--------------------------------------+");
        System.out.println("| Name: "+super.getName());
        System.out.println("| Age: "+super.getAge());
        System.out.println("| Type: "+this.type);
        System.out.println("| Milk Produced Per Day: "+this.milkProducedPerDay);
        System.out.println("| Distance Walked Per Day: "+this.distanceWalkedPerDay);
        System.out.println("| Grass Eaten Per Day: "+this.grassEatenPerDay);
        System.out.println("+--------------------------------------+");
    }







    
}
