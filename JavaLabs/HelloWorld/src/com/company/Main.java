package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
