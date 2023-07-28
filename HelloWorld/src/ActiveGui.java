import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActiveGui implements ActionListener {
    public ActiveGui() {
        JFrame frame = new JFrame("My swing application");
        JButton button = new JButton("Push Me!");

        //add event to the button
        button.setActionCommand("push");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setSize(400,200);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("push")){
            System.out.println("You clicked Me!");
        }
    }
    public static void main(String[] args){
        ActiveGui myPush= new ActiveGui();
    }
}