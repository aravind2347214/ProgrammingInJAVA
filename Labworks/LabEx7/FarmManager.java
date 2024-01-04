package Labworks.LabEx7;

import java.util.List;

class FarmManager {
    private List<Animal> farmAnimals;

    public FarmManager(List<Animal> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    // Method to perform tasks on the farm
    public void performTasks(FarmTask task) {
        for (Animal item : farmAnimals) {
            task.performTask(item);
        }
    }
}