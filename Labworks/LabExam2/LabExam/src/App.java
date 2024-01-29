import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.event.ActionListener;

// Develop a Bank Management System using Java Swing components to create
// an intuitive Bank Registration Form. The form should capture essential details
// such as Bank Employee ID, Name, Age, Designation, and Department/section.
// Ensure that the entered data is stored in a database table named 'Bank.'
// Additionally, implement a search operation allowing users to retrieve bank
// employee information based on either the name or department criteria.


public class App extends JFrame{

    private JTextField employeeIdField, nameField, ageField, designationField, departmentField;
    private JButton registerButton, searchButton,clearButton ;
    private JTextArea resultArea;


    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS Bank (" +
            "id INT AUTO_INCREMENT PRIMARY KEY ," +
            "EmployeeID INT NOT NULL,"+
            "Name VARCHAR(255) NOT NULL," +
            "Age INT NOT NULL," +
            "Designation VARCHAR(255) NOT NULL,"+
            "Department VARCHAR(255) NOT NULL)";

    private static final String INSERT_EMP_SQL = "INSERT INTO Bank (EmployeeID, Name, Age, Designation, Department) VALUES (?, ?, ?, ?, ?)";
    // private static final String UPDATE_DATA_SQL = "UPDATE <tablename> SET col1=?, col2=? WHERE col3=?";
    // private static final String DELETE_DATA_SQL = "DELETE FROM <tablename> WHERE col3 = ?";
    // private static final String SELECT_ALL_EMP_SQL = "SELECT * FROM <tablename>";
    private static final String SEARCH_EMP = "SELECT * FROM Bank WHERE Name = ? OR Department=?";
    private static final String CLEAR_ALL = "DELETE FROM Bank";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/labexam";
    private static final String USER = "root";
    private static final String PASSWORD = "";
   



        public App(Connection conn) {
        setTitle("Bank Management System");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        JPanel formPanel =  new JPanel();
        JPanel ButtonPanel =  new JPanel();
        JPanel ResultPanel = new JPanel();

        makeUI(formPanel,ButtonPanel,ResultPanel);

        registerButton.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e) {
                addNewEmployee(conn);
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FindEmployee(conn);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ClearEmployees(conn);
            }
        });
    }

    private void ClearEmployees(Connection conn){
        try {
            PreparedStatement deleteAll = conn.prepareStatement(CLEAR_ALL);
            int rowsDeleted = deleteAll.executeUpdate();
            if (rowsDeleted > 0) {
                resultArea.setText("    All Employeees Deleted");}
            
        } catch (Exception e) {
            e.printStackTrace();
            resultArea.setText("    Deletion Failed");
            
        }


    }

    

    private void ResetTextFields(){
        employeeIdField.setText("");
        nameField.setText("");
        ageField.setText("");
        designationField.setText("");
        departmentField.setText("");
        
    }


    private void FindEmployee(Connection conn) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "your_username", "your_password");

            PreparedStatement preparedStatement = conn.prepareStatement(SEARCH_EMP);
            preparedStatement.setString(1, nameField.getText());
            preparedStatement.setString(2, departmentField.getText());

            ResultSet resultSet = preparedStatement.executeQuery();

            StringBuilder resultText = new StringBuilder();
            while (resultSet.next()) {
                resultText.append(" |   Employee ID: ").append(resultSet.getString("EmployeeID")).append("\n");
                resultText.append(" |   Name: ").append(resultSet.getString("Name")).append("\n");
                resultText.append(" |   Age: ").append(resultSet.getString("Age")).append("\n");
                resultText.append(" |   Designation: ").append(resultSet.getString("Designation")).append("\n");
                resultText.append(" |   Department: ").append(resultSet.getString("Department")).append("\n\n");
            }
            resultArea.setText(resultText.toString());

            // connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            resultArea.setText("Error searching for employee.");
        }
        finally{
            ResetTextFields();
        }
    }


    private void makeUI(JPanel formPanel,JPanel ButtonPanel, JPanel ResultPanel ) {

        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 10 pixels padding on all sides
        ResultPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 10 pixels padding on all sides

        formPanel.setLayout(new GridLayout(5, 2, 4, 4));
        ButtonPanel.setLayout(new FlowLayout());

        JLabel employeeIdLabel = new JLabel("Employee ID:");
        employeeIdField = new JTextField(20);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField(20);

        JLabel designationLabel = new JLabel("Designation:");
        designationField = new JTextField(20);

        JLabel departmentLabel = new JLabel("Department:");
        departmentField = new JTextField(20);

        registerButton = new JButton("Register");
        searchButton = new JButton("Search");
        clearButton = new JButton("Clear All");

        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        formPanel.add(employeeIdLabel);
        formPanel.add(employeeIdField);
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(ageLabel);
        formPanel.add(ageField);
        formPanel.add(designationLabel);
        formPanel.add(designationField);
        formPanel.add(departmentLabel);
        formPanel.add(departmentField);
        ButtonPanel.add(registerButton);
        ButtonPanel.add(searchButton);
        ResultPanel.add(resultArea);
        ButtonPanel.add(clearButton);

        add(formPanel,BorderLayout.NORTH);
        add(ButtonPanel,BorderLayout.CENTER);
        add(ResultPanel,BorderLayout.SOUTH);
    }


    
    private void addNewEmployee(Connection conn) {
        try {
            // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "your_username", "your_password");
            PreparedStatement preparedStatement = conn.prepareStatement(INSERT_EMP_SQL);
            preparedStatement.setString(1, employeeIdField.getText());
            preparedStatement.setString(2, nameField.getText());
            preparedStatement.setString(3, ageField.getText());
            preparedStatement.setString(4, designationField.getText());
            preparedStatement.setString(5, departmentField.getText());

            preparedStatement.execute();

            resultArea.setText("Employee registered successfully!");

            // connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            resultArea.setText("Error registering employee.");
        }
        finally{
            ResetTextFields();
        }
    }




    public static void main(String[] args) throws Exception {
        try{
            Connection conn = DriverManager.getConnection(JDBC_URL,USER,PASSWORD);
            Statement createTable = conn.createStatement();
            createTable.executeUpdate(CREATE_TABLE_SQL);
            System.out.println("CONNECTION SUCCESS");
            new App(conn).setVisible(true);
            

        }catch (Exception e){
            System.out.println("CONNECTION FAILED " + e.getClass());
            e.printStackTrace();

        }
        
            
    }
    // public static void main(String[] args) {
    //     SwingUtilities.invokeLater(new Runnable() {
    //         public void run() {
    //             new BankManagementSystem(Connection conn).setVisible(true);
    //         }
    //     });
    // }

   
}
