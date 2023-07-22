import javax.swing.*;

public class Swing {
    public static void main(String[] args){

        //create the top-level window.
        JFrame myJFrame = new JFrame("My swing application");
        JLabel myLabel = new JLabel("HelloWorld!");
        myJFrame.getContentPane().add(myLabel);

        myJFrame.pack();
        myJFrame.setVisible(true);
    }
}
