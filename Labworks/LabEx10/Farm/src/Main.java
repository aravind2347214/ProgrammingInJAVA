
import java.sql.*;
import java.util.Scanner;

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
}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final String CREATE_TABLE_SQL =
            "CREATE TABLE IF NOT EXISTS animals (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL," +
                    "legs INT NOT NULL)";

    private static final String INSERT_ANIMAL_SQL =
            "INSERT INTO animals (name, legs) VALUES (?, ?)";
    private static final String UPDATE_ANIMAL_SQL =
            "UPDATE animals SET name=?, legs=? WHERE id=?";
    private static  final String DELETE_ANIMAL_SQL =
            "DELETE FROM animals WHERE id = ?";
    private static final String SELECT_ALL_ANIMALS_SQL =
            "SELECT * FROM animals";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/farm";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            Connection conn = DriverManager.getConnection(JDBC_URL,USER,PASSWORD);
            Statement createTable = conn.createStatement();
            createTable.executeUpdate(CREATE_TABLE_SQL);
            System.out.println("CONNECTION SUCCESS");
            MenuFunction(sc,conn);
        }catch (Exception e){
            System.out.println("CONNECTION FAILED " + e.getClass());
            e.printStackTrace();

        }



    }
    public static void MenuFunction(Scanner sc,Connection conn){
        while (true) {
            System.out.println("Farm Animal CRUD Menu:");
            System.out.println("1. Add Animal");
            System.out.println("2. Update Animal");
            System.out.println("3. Delete Animal");
            System.out.println("4. Show All Animals");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    addAnimal(sc,conn);
                    break;
                case 2:
                    updateAnimal(sc,conn);
                    break;
                case 3:
                    deleteAnimal(sc,conn);
                    break;
                case 4:
                    showAllAnimals(conn);
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

    }


    private static void addAnimal(Scanner sc , Connection conn) {

        System.out.print("Enter animal name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of legs: ");
        int legs = sc.nextInt();
        FarmAnimal newAnimal = new FarmAnimal(name,legs);

        try {
            PreparedStatement insertStatement = conn.prepareStatement(INSERT_ANIMAL_SQL);
            insertStatement.setString(1, name);
            insertStatement.setInt(2, legs);

            int affectedRows = insertStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Animal added successfully!");
            } else {
                System.out.println("Failed to add animal.");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void showAllAnimals(Connection conn) {
        System.out.println("----Animal Database----");
        try{
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL_ANIMALS_SQL);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int legs = resultSet.getInt("legs");

                System.out.println("[ ID: " + id + ", Name: " + name + ", Legs: " + legs+" ]");
            }
            System.out.println("-----------------------");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void deleteAnimal(Scanner sc , Connection conn){

        System.out.println("Enter ID of animal To delete : ");
        int delId = sc.nextInt();
        try{
            PreparedStatement deleteStatement = conn.prepareStatement(DELETE_ANIMAL_SQL);
            deleteStatement.setInt(1,delId);
            int affectedRows = deleteStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Animal deleted successfully!");
            } else {
                System.out.println("Failed to delete animal. Check if the ID is correct.");
            }


        }catch(Exception e){
            e.printStackTrace();
        }


    }
    private static void updateAnimal(Scanner sc , Connection conn ){
        System.out.println("Enter ID of animal To Update : ");
        int updateId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter animal New name: ");
        String name = sc.nextLine();

        System.out.print("Enter New number of legs: ");
        int legs = sc.nextInt();

        try{
            PreparedStatement updateStatement = conn.prepareStatement(UPDATE_ANIMAL_SQL);
            updateStatement.setInt(3,updateId);
            updateStatement.setString(1,name);
            updateStatement.setInt(2,legs);

            int affectedRows = updateStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Animal data updated successfully!");
            } else {
                System.out.println("Failed to update animal with ID :"+updateId);
            }


        }catch (Exception e){
            e.printStackTrace();
        }


    }

}