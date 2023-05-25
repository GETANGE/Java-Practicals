import java.util.Scanner;

import javax.swing.JOptionPane;

class test{
    String number="075673xxxx";
    String name="Emmanuel";
    public static void main(String[] args){
        System.out.println("Java is simple!");
        System.out.println("When the class is not public,you can name your class anyvalue");

        test test1=new test();//instantiation .
        System.out.println("My name is :" + test1.name);
        System.out.println("My number is :" + test1.number);
    }
    
}

public class Test{
    public static void main(String[] args){
        System.out.println("When the class is public, the name of the file has to be the class name.");
    }
}

//functions (methods) in java.
class Box{
    int width=10;
    int height=20;
    int depth=34;

    void calculateVolume(){
        System.out.println("The volume is :");
        System.out.println(width*height*depth);
    }
    public static void main(String[] args){

        Box box ;//reference your object
        box= new Box();//allocate the class Box an object.
        box.calculateVolume();
    }
}



class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        double num3;
        String myName;

        System.out.println("Enter num1 and num2:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        System.out.println("Enter num3 (double):");
        num3 = scan.nextDouble();
        
        // Consume the remaining newline character from the previous input
        scan.nextLine();
        
        System.out.println("Enter your name:");
        myName = scan.nextLine();
        
        // Print the input values
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println("Your Name is: " + myName);
        scan.close();
    }
}

class Test3 {
    public static void main(String[] args) {
    
        String input = JOptionPane.showInputDialog("Enter num1");
        int num1 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter num2");
        double num2 = Double.parseDouble(input);

        String myName = JOptionPane.showInputDialog("Enter name:");
        JOptionPane.showMessageDialog(null, "Your name is: " + myName);
    }
}
