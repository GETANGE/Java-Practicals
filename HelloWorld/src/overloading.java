public class overloading {
    // use of method overloading.
    static int plusMethod (int x,int y) {
        return x + y;
    }
    static double plusMethod(double x,double y) {
        return x + y;
    }

    //method for recursion.
    public static int sum(int k){
        if(k>0){
            return k +sum(k-1);
        }else{
            return 0; // halting condition .
        }
    }
    public static int sum1(int start, int end){
        if(end>start){
            return end + sum1(start, end-1);
        }else{
            return 0; // halting condition .
        }
    }
    public static void main (String[] args){
        // method scope.
        //  System.out.println(x); //code here cannot use variable x
        int x = 5;
        int num1= plusMethod(20,23);
        double num2= plusMethod(23.5 ,34.6);
        System.out.println("Sum of integers: " +num1);
        System.out.println("Sum of doubles: " +num2);
        System.out.println("The value of x is: " +x);
        //trying to access the value in the block scope (cannot be accessed outside the braces.)
        //System.out.println("The value in the block scope is: " + y);
        {
            int y = 34;
            System.out.println("The value in the block scope is: " +y);
        }

        //recursion in java.
        int result=sum(10);
        System.out.println("The sum is :"+result);
        int result1 = sum1(10,20);
        System.out.println("The sum is :"+result1);
    }
}
