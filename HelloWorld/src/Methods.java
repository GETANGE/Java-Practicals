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
    static void myMethod2(String fname1, int age){
        System.out.println(fname1+" is "+ age +" "+"Years");
    }
    static int myMethod3(int x){
        return 5 + x;
    }
    static int myMethod4(int x,int y){
        return x * y;
    }
    static int myMethod5(int x,int y){
        return x / y;
    }
    static void myMethod6(int age){
        if(age<18){
            System.out.println("Not eligible for voting.....too young");
        }else{
            System.out.println("Eligible for voting.....");
        }
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
        myMethod1("Muthoni");
        myMethod2("Emmanuel", 22);
        System.out.println(myMethod3(3));
        System.out.println(myMethod4(4,10));

        int z =myMethod5(5,7);
        System.out.println(z);
        myMethod6(20);
    }

    public double getAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
