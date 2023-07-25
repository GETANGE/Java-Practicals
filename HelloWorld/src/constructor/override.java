package constructor;

public class override {
    String name;

    override(){
        this.name = "Emmanuel";
    }
    override(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println("My name is  " + this.name);
    }
    public static void main(String[] args){
        override obj1= new override();
        override obj2= new override("Getange");

        obj1.getName();
        obj2.getName();
    }
}
