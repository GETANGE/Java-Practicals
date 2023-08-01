package constructor;

class Person1{
    private String name;
    private String gender;
    private int age;

    public void display(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    // use getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Teacher extends Person1 {
    public Teacher(String name, String gender, int age) {
        super(name, gender, age);
    }
}

class Student extends Person1 {
    public Student(String name, String gender, int age) {
        super(name, gender, age);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", "Male", 35);
        Student student = new Student("Jane", "Female", 22);

        System.out.println("Teacher Name: " + teacher.getName() + ", Gender: " + teacher.getGender() + ", Age: " + teacher.getAge());
        System.out.println("Student Name: " + student.getName() + ", Gender: " + student.getGender() + ", Age: " + student.getAge());
    }
}