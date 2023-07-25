package constructor;

import java.lang.reflect.Constructor;

public class constructor {
    String languages;

    constructor(String lang){
        languages = lang;
        System.out.println(languages+" is a programming language");
    }
    public static void main(String[] args){
        //initialize an object .
        constructor myObj= new constructor("Java");
        constructor myObj1= new constructor("Javascript");
        constructor myObj2= new constructor("Python");
    }
}
