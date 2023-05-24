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