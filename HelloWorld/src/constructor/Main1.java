package constructor;

class Animals {
    public String name;

    public void eat() {
        System.out.println("I am eating");
    }
}

class Dogs extends Animals {
    public void getInfo(){
        System.out.println("My name is " + name);
    }
    public void eat() {
        super.eat();
        System.out.println("I love dog food");
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dogs labrador2 = new Dogs();
        labrador2.name = "Emmanuel";

        labrador2.getInfo();
        labrador2.eat();
        labrador2.bark();
    }
}
