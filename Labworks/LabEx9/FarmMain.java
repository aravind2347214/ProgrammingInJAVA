import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class FarmAnimal {
    private String name;
    private int legs;

    public FarmAnimal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

interface FarmTask {
    void performTask(FarmAnimal item);

    String getTaskDescription();
}

// FeedingTask class
class FeedingTask implements FarmTask {
    @Override
    public void performTask(FarmAnimal item) {
        // Implementation of feeding task
        System.out.println(item.getName() + " is being fed.");
    }

    @Override
    public String getTaskDescription() {
        return " is being Fed";
    }
}

// GrazingTask class
class GrazingTask implements FarmTask {
    @Override
    public void performTask(FarmAnimal item) {
        // Implementation of grazing task
        System.out.println(item.getName() + " is grazing.");
    }

    @Override
    public String getTaskDescription() {
        return " is Grazing";
    }
}

// MakingSoundTask class
class MakingSoundTask implements FarmTask {
    @Override
    public void performTask(FarmAnimal item) {
        // Implementation of making sound task
        item.makeSound();
    }

    @Override
    public String getTaskDescription() {
        return " is Making Sound";
    }
}

class FarmManager {
    private List<FarmAnimal> farmAnimals;
    private List<String> performedTasks;
    private String currentTask;

    public FarmManager(List<FarmAnimal> farmAnimals) {
        this.farmAnimals = farmAnimals;
        this.performedTasks = new ArrayList<>();
        this.currentTask = "";
    }

    public void performTask(FarmAnimal animal, FarmTask task) {
        task.performTask(animal);
        currentTask = animal.getName() + task.getTaskDescription();
        performedTasks.add(currentTask);
    }

    public List<String> getPerformedTasks() {
        return performedTasks;
    }

    public String getCurrentTask() {
        return currentTask;
    }

    public void clearTasks() {
        performedTasks.clear();
        currentTask = "";
    }

    public List<FarmAnimal> getFarmAnimals() {
        return farmAnimals;
    }
}

public class FarmMain extends JFrame {
    private JComboBox<String> animalComboBox;
    private JComboBox<String> taskComboBox;
    private JLabel actionLabel;
    private JButton performTaskButton;
    private JButton clearTasksButton;
    private FarmManager farmManager;

    public FarmMain() {
        // Initializing farm animals
        List<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(new FarmAnimal("Bessie", 4));
        farmAnimals.add(new FarmAnimal("Fluffy", 4));
        farmAnimals.add(new FarmAnimal("Spot", 4));

        farmManager = new FarmManager(farmAnimals);

        // Setting up the JFrame
        setTitle("Farm Management System");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating components
        animalComboBox = new JComboBox<>(farmAnimals.stream().map(FarmAnimal::getName).toArray(String[]::new));
        taskComboBox = new JComboBox<>(new String[] { "Feeding", "Make Sound", "Grazing" });
        actionLabel = new JLabel("Current Action: ");
        performTaskButton = new JButton("Perform Task");
        clearTasksButton = new JButton("Clear All Tasks");

        // Adding action listener to the buttons
        performTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performTask();
            }
        });

        clearTasksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearTasks();
            }
        });

        // Setting layout manager (GridLayout for simplicity)
        setLayout(new GridLayout(4, 2));

        // Adding components to the JFrame
        add(new JLabel("Choose Animal: "));
        add(animalComboBox);
        add(new JLabel("Choose Task: "));
        add(taskComboBox);
        add(performTaskButton);
        add(clearTasksButton);
        add(actionLabel);

        // Displaying the JFrame
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void performTask() {
        String selectedAnimal = (String) animalComboBox.getSelectedItem();
        String selectedTask = (String) taskComboBox.getSelectedItem();

        // Find the selected animal
        FarmAnimal selectedAnimalObject = farmManager.getFarmAnimals().stream()
                .filter(animal -> animal.getName().equals(selectedAnimal))
                .findFirst().orElse(null);

        if (selectedAnimalObject != null) {
            // Create instances of FarmTask for each task type
            FarmTask feedingTask = new FeedingTask();
            FarmTask grazingTask = new GrazingTask();
            FarmTask makingSoundTask = new MakingSoundTask();

            // Lambda expression to select the appropriate task
            FarmTask task;
            switch (selectedTask) {
                case "Feeding":
                    task = feedingTask;
                    break;
                case "Grazing":
                    task = grazingTask;
                    break;
                case "Make Sound":
                    task = makingSoundTask;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown task type: " + selectedTask);
            }

            // Perform the selected task on the selected animal
            farmManager.performTask(selectedAnimalObject, task);

            // Update the UI or perform any other necessary actions
            updateUI();
        }
    }

    private void clearTasks() {
        farmManager.clearTasks();
        updateUI();
    }

    private void updateUI() {
        actionLabel.setText("Current Action: " + farmManager.getCurrentTask());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FarmMain());
    }
}
