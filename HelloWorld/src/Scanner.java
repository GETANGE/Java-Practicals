import java.util.Scanner;

class input{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        //method scanner to get integer from the user.
        System.out.println("Enter your integer");
        int number = input.nextInt();
        System.out.println("You've  entered " + number );

        //method to get double from the user.
        System.out.println("Enter your double");
        double number2 = input.nextDouble();
        System.out.println("You've entered " + number2);

        //method to get float from the user.
        System.out.println("Enter your float");
        float number3 = input.nextFloat();
        System.out.println("You've entered " + number3);

        //method to get string from the user.
        System.out.println("Enter your string[your name]");
        String name = input.next();
        System.out.println("Your name is " + name);

        input.close();
    }
}
