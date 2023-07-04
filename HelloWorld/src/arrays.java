import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        int[] arr2 = {2, -1, 10, 1000, 56};
        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i]);
        }

        int[] arr3 = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("Enter Element " + (i + 1));
            arr3[i] = scan.nextInt();
        }
        System.out.println("Entered " + arr3.length + " elements");
        for (int element : arr3) {
            System.out.println(element);
        }

        int[][] arr4 = {{10, 20, -2, 7}, {-70, 23, 98, 2}, {101, 123, 160, 0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        printElements();
        loop();
        loop2();
        calculate();
    }

    public static void printElements() {
        int[] age = {1, 2, 3, 4, -5, 6, 7, 8};

        System.out.println("First element: " + age[0]);
        System.out.println("Second element: " + age[1]);
        System.out.println("Third element: " + age[2]);
        System.out.println("Fourth element: " + age[3]);
        System.out.println("Fifth element: " + age[4]);
    }
    //looping through using loops.
    public static void loop(){
        int[] age ={1,2,3,4,5,6,7,};
        //loop through the array using for loop.
        System.out.println("Looping through using for loop");
        for(int i = 0; i < age.length; i++){
            System.out.println(age[i]);
        }
    }
    //using for each loop in java.
    public static void loop2(){
        int[] age ={1,2,3,4,5,6,};
        //loop through the array using for each loop.
        System.out.println("Looping through using for each loop");
        for(int a:age){
           System.out.println(a);
        }
    }

    //calculating the sum of array elements.
    public static void calculate(){
        int[] array = {1,-4,-3,4,6,7,-8,9};
        int sum = 0;
        double average;

        //access the elements using for each loop.
        // add each element
        for(int number:array){
            sum += number;
        }
        //get the total number of elements
        int arrayLength =array.length;

        //calculate the average and covert it from int to average.
        average=((double)sum/(double)arrayLength);
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: "+average);
    }
}
