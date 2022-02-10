package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        // Make an if, else statement where the else statement triggers a print or println statement
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        // Make 2 variables and use them in an if else conditional print from one of the sections
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        System.out.println("Hello World");
        int x = 5;
        int y = 3;
        //1st
        if (x == 5)
            System.out.println("x equals 5");
        //2nd
        if (x == 3)
            System.out.println("x equals 3");
        else
            System.out.println("x does not equal 3");
        //3rd
        if (x == 3)
            System.out.println("x equals 3");
        else
        if(x == 5)
            System.out.println("x equals 5");
        //4th
        if (x == 5)
            System.out.println("The value of y is " + y);
        //5th
        if (x == 5 && y == 3)
            System.out.println("x equals 5 and y equals 3");
        //6th
        if (x == 5 || y == 3)
            System.out.println("Either x equals 5 or y equals 3, or even both x equals 5 and y equals 3");

    }
}
