public class operators {
    public static void main(String[] args) {
        // java operators.
        int a = 12, b = 5;
        //addition operator
        System.out.println("a + b=" + (a + b));
        // subtraction operator
        System.out.println("a -b=" + (a - b));
        // multiplication operator
        System.out.println("a * b=" + (a * b));
        // division operator
        System.out.println("a / b=" + (a / b));
        // modulus operator
        // output the remainder.
        System.out.println("a % b=" + (a % b));


        int C = 4;
        int var;
        //assign value using =
        var = C;
        System.out.println("Var using the = :" + " "+ var);
        //assign value using =+
        System.out.println("Var using the =+" +" "+ var);
        //assign value using =*
        System.out.println("Var using the *=" + " "+var);

        //use of relational operators.
        int d=10, e=11;
        //use ==
        System.out.println(d == e);  //false
        System.out.println(d != e); //true
        System.out.println(d > e); //false
        System.out.println(d < e); //true
        System.out.println(d >= e); //false
        System.out.println(d <= e); //true

        //ternary operators.
        //shorthand operators
        int februaryDay = 29;
        String result;

        result =(februaryDay == 28)?"NOT a leap year":" A leap year";
        System.out.println(result);
    }
}