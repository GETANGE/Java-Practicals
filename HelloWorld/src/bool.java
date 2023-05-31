public class bool {
    public static void main(String[] args){
        boolean flag=true; //by default the boolean data type is false.
        System.out.println(flag);//returns true.

        byte range=124;//range from -128 to 127.Commonly used instead of integer to save memory.
        System.out.println(range);

        short temperature; //the default value for this primitive data type is 0.
        temperature=-200;
        System.out.println(temperature);

        int range1=-2345;// default value for this primitive data type is 0.
        System.out.println(range1);

        long range2=-1234567L; //the 'L' is used to represent an integer of 'long' type.
        System.out.println(range2);

        double number=-42.8;
        System.out.println(number);

        float number1=12.3f;//should never be used for precise values.
        System.out.println(number1);

        char letter='\u0052';
        System.out.println(letter);
    }
}
