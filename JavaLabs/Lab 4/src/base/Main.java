//package base;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    
     // Raise to the power of function
     static void powerTo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = scan.nextInt();
        System.out.println("Enter the power");
        double b = scan.nextInt();
        scan.close();
        System.out.println(Math.pow(a, b));
     }
        
        
    static void howMany(){
        int finalNumber = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int arrayLength = scan.nextInt();
        int [] userArray = new int[arrayLength];
        System.out.println("Enter the occurance number");
        int occuranceNumber = scan.nextInt();
        System.out.println("Enter the numbers in the array");
            for(int x=0; x<arrayLength; x++){
                userArray[x] = scan.nextInt();
                if (occuranceNumber == userArray[x]){
                    finalNumber++;
                }
            }
            System.out.println("The amount of time is occurs is " + finalNumber);
        }
  

    static void arraySum(){
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int arrayLength = scan.nextInt();
        int [] userArray = new int[arrayLength];
        System.out.println("Enter the numbers in the array");
            for(int x=0; x<arrayLength; x++){
                userArray[x] = scan.nextInt();
                sum += userArray[x];
            }
        System.out.println("The sum of the array is " + sum);
    


    }

    static void pythagorean(){
        int a = 5;
        int b = 3;
        double c = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
        System.out.println(c);
    
            

        }


    static void switchUse(){
        String color = "red";
        switch(color){
            case "red":
                System.out.println("You picked red");
                break;
            case "blue":
                System.out.println("you picked blue");
                break;
            case "yellow":
                System.out.println("you picked yellow");
                break;
            default:
                System.out.println("Huh?");}
        
       

            




    }






        





    
            

                


    

     
         
     
    public static void main(String[] args) {
        // Give me an example of you using switch case.
        // Give me an example of you using a for loop
   //powerTo();
    //howMany();
    //arraySum();
    //pythagorean();
    switchUse();
        // Give me an example of you using a while loop
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */

    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */

    int addition(int a, int b) {
        int answer = a + b;
        return answer;
    }

    int division(int a, int b) {
        int answer = a / b;
        return answer;
    }
}
