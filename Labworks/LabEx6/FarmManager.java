package Labworks.LabEx6;

import java.util.List;

// Generic FarmManager class
public class FarmManager<T> {
    private List<T> farmItems;

    public FarmManager(List<T> farmItems) {
        this.farmItems = farmItems;
    }

    // Generic method to perform tasks on the farm
    public <U extends FarmTask<T>> void performTasks(U task) {
        for (T item : farmItems) {
            task.performTask(item);
        }
    }
}