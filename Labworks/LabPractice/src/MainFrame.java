import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName;
    JTextField tfLastName;

    public void initialize(){

        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        JLabel lbWelcome = new JLabel();

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("First Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);



        JButton btnOK = new JButton("OK");
       

        btnOK.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String lastName =  tfLastName.getText();
                lbWelcome.setText("Welcome "+firstName+" "+lastName);
            }       
         });

         JButton btnClear = new JButton("Clear");
         btnClear.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("Enter your name: ");
            }
         });

         JPanel buttonPanel =  new JPanel();
         buttonPanel.setLayout(new GridLayout(1,2,5,5));
         buttonPanel.add(btnClear);
         buttonPanel.add(btnOK);


        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        JPanel mainPanel= new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(122,213,111));
        setTitle("The app Title");
        setSize(500,500);
        setMinimumSize(new Dimension(200, 300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        mainPanel.add(formPanel,BorderLayout.NORTH);
        mainPanel.add(lbWelcome,BorderLayout.CENTER);
        mainPanel.add(buttonPanel,BorderLayout.SOUTH);

        add(mainPanel);

    }

    
}
