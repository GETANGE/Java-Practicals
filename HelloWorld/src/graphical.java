import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class graphical{
    private JFrame frame;
    private JLabel label1 ,label2 ,label3;
    private JTextField textField1, textField2, textField3;
    private JButton button1, button2;

     public graphical(){
         frame=new JFrame("Swing Application");
         frame.setSize(500, 300);
         frame.setLayout(null);

         label1=new JLabel("Name");
         label1.setBounds(50, 20, 60,20);
         frame.add(label1);

         label2=new JLabel("Age");
         label2.setBounds(200,20, 60,20);
         frame.add(label2);

         label3=new JLabel("Email");
         label3.setBounds(350,20,60,30);
         frame.add(label3);

         textField1 = new JTextField();
         textField1.setBounds(50, 50, 100, 25);
         frame.add(textField1);


         textField2 = new JTextField();
         textField2.setBounds(200, 50, 100, 25);
         frame.add(textField2);

         textField3 = new JTextField();
         textField3.setBounds(350, 50, 100, 25);
         frame.add(textField3);

         button1 = new JButton("Submit");
         button1.setBounds(150, 120, 100, 30);
         frame.add(button1);

         button2 = new JButton("Cancel");
         button2.setBounds(280, 120, 100, 30);
         frame.add(button2);

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
     }

    public static void main(String[] args) {
        new graphical();
    }
}