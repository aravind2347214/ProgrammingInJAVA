package Labworks.LabEx8;
import java.util.List;

class FarmManager {
    private List<FarmAnimal> farmAnimals;

    public FarmManager(List<FarmAnimal> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    // Method to perform tasks on the farm
    public void performTasks(FarmTask task) {
        for (FarmAnimal item : farmAnimals) {
            task.performTask(item);
        }
    }
}