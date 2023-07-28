public class exam {
    private String Name1;

    //constructor with no arguments.
    public exam(){
        System.out.println("The constructor called is:");
        Name1 = "Getange";
    }
    public static void main(String[] args){
        for(int i=1; i<=8; i++){
            for(int j=1; j<=4; j++){
                System.out.print(i*j+ " ");
            }
            System.out.println(i+" ");
        }
        //initialize an object using the constructor.
        exam myObj= new exam();
        System.out.println("My name is " + myObj.Name1);
    }
}
