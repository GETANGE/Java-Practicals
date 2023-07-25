import javax.swing.*;
import java.awt.*;

public class Swing {
    public static void main(String[] args){

        JFrame frame = new JFrame("My swing App");
        JPanel myPanel = new JPanel();

        //creating the main frame.
        frame.getContentPane().add(myPanel);
        myPanel.setBounds(40,80,200,200);
        myPanel.setBackground(Color.gray);

        //creating the buttons.
        JButton button = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        //create text fields
        JTextField textField = new JTextField();
        JTextField textField2 = new JTextField();

        //set bounds to the text field
        textField.setBounds(50,20 ,80, 30);
        textField2.setBounds(50,20,80,30);

        button.setBounds(50,100,80,30);
        button2.setBounds(100,100,80,30);

        button.setBackground(Color.green);
        button2.setBackground(Color.yellow);
        myPanel.add(button);
        myPanel.add(button2);
        myPanel.add(textField);
        myPanel.add(textField2);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
