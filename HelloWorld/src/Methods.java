public class Methods {
    public int getSum(int a, int b) {
        return a + b;
    }
    //belongs to the class Methods and not object class.
    static void myMethod(){
        System.out.println("I have been executed!");
    }
    static void myMethod1(String fname){
        System.out.println(fname +" "+ "Getange");
    }
    public static void main(String[] args) {
        Methods methods = new Methods();
        int num1 = 20, num2 = 3;

        int sum = methods.getSum(num1, num2);
        System.out.println("Sum is " + sum);

        int a = 30, b = 30, c = 30;
        double avg = methods.getAverage(a, b, c);
        System.out.println("Average is " + avg);
        myMethod();

        //methods can be called more than once.
        myMethod();
        myMethod();
        myMethod1("Emmanuel");
        myMethod1("JoyElizabeth");
        myMethod1("Mothoni");
    }

    public double getAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
