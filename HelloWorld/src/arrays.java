import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
        int [] arr = new int[5];
        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }
        int [] arr2 ={2,-1,10,1000,56};//initializing array of lists.
        for(int i=0; i<5; i++){
            System.out.println(arr2[i]);
        }

        //array of dynamic initialization.
        int arr3[]=new int[5];
        Scanner scan=new Scanner(System.in);
        for(int i=0; i<arr3.length; i++){
            System.out.println("Enter Element"+(i+1));
            arr3[i]= scan.nextInt();
        }
        System.out.println("Entered Element "+arr3.length+" elements");
        for(int element:arr3){
            System.out.println(element);
        }

        //2D array in java.
        int[][] arr4={{10,20,-2,7},{-70,23,98,2},{101,123,160,0}};

            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    System.out.print(arr4[i][j]+" ");
                }
                System.out.println( );
            }
    }
}
