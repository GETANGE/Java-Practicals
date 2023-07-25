package constructor;

class Animal{
    String name;
    public void eat(){
        System.out.println("I eat ");
    }
}
class Dog extends Animal{
    public void display(){
        System.out.println("My name is :" +" "+ name);
    }
}

class Main{
    public static void main(String[] args){
        //initialize the object from the subclass.
        Dog labrador= new Dog();
        labrador.name="Kambusi";
        labrador.display();
        //call the superclass using the subclass object
        labrador.eat();

    }
}