package Learning.Swingtest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        final JTextField tf= new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b = new JButton("Click Here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tf.setText("Button was pressed");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);

    }
    
}
