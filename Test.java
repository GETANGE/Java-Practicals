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