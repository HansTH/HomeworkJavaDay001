package com.hansterhorst.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
            * Java Basic Exercises part 1 *

            1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
            Expected Output :
            Hello
            Alexandra Abramov
        */
        String hello = "Hello";
        String name = "Alexandra Abramov";
        System.out.println(hello);
        System.out.println(name);

        /*
            2. Write a Java program to print the sum of two numbers.
            Test Data:
            74 + 36
            Expected Output :
            110
        */
        System.out.println(74 + 36);

        /*
            3. Write a Java program to divide two numbers and print on the screen.
            Test Data :
            50/3
            Expected Output :
            16
        */
        System.out.println(50 / 3);

        /*
            4. Write a Java program to print the result of the following operations.
            Test Data:
            a. -5 + 8 * 6
            b. (55+9) % 9
            c. 20 + -3*5 / 8
            d. 5 + 15 / 3 * 2 - 8 % 3
            Expected Output :
            43
            1
            19
            13
        */
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        /*
            5. Write a Java program that takes two numbers as input and display the product of two numbers.
            Test Data:
            Input first number: 25
            Input second number: 5
            Expected Output :
            25 x 5 = 125
        */
        System.out.println("Type first value");
        int sum1 = scanner.nextInt();

        System.out.println("Type second value");
        int sum2 = scanner.nextInt();

        System.out.println("The sum of " + sum1 + " + " + sum2 + " = " + (sum1 + sum2));

        /*
            6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
            Test Data:
            Input first number: 125
            Input second number: 24
            Expected Output :
            125 + 24 = 149
            125 - 24 = 101
            125 x 24 = 3000
            125 / 24 = 5
            125 mod 24 = 5
        */
        System.out.println("Type first value");
        int firstInput = scanner.nextInt();

        System.out.println("Type second value");
        int secondInput = scanner.nextInt();

        System.out.println(firstInput + secondInput);
        System.out.println(firstInput - secondInput);
        System.out.println(firstInput * secondInput);
        System.out.println(firstInput / secondInput);
        System.out.println(firstInput % secondInput);

        /*
            7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
            Test Data:
            Input a number: 8
            Expected Output :
            8 x 1 = 8
            8 x 2 = 16
            8 x 3 = 24
            ...
            8 x 10 = 80
        */
        System.out.println("Type table number");
        int tableNum = scanner.nextInt();
        int timesNum = 0;

        while (timesNum < 10){
            timesNum++;
            System.out.println(tableNum + " x " + timesNum + " = " + tableNum * timesNum);
        }

        /*
            12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        */
        System.out.println("Type number 1");
        int num1 = scanner.nextInt();

        System.out.println("Type number 2");
        int num2 = scanner.nextInt();

        System.out.println("Type number 3");
        int num3 = scanner.nextInt();

        System.out.println("The average number is: " + (num1 + num2 + num3) / 3);

        /*
            13. Write a Java program to print the area and perimeter of a rectangle.
            Test Data:
            Width = 5.5 Height = 8.5

            Expected Output
            Area is 5.6 * 8.5 = 47.60
            Perimeter is 2 * (5.6 + 8.5) = 28.20
        */

        System.out.println("What is the width?");
        double width = scanner.nextDouble();

        System.out.println("What is the height?");
        double height = scanner.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("The area is: " + area);
        System.out.println("the perimeter is: " + perimeter);


        /*
         * Java Conditional Statement Exercises *
         */

        /*
            1. Write a Java program to get a number from the user and print whether it is positive or negative.

            Test Data
            Input number: 35
            Expected Output :
            Number is positive
        */
        int inputNum = 34;

        if (inputNum % 2 == 0){
            System.out.println("The number " + inputNum +  " is positive.");
        } else {
            System.out.println("The number " + inputNum +  " is negative.");
        }

        /*
            2. Write a Java program to solve quadratic equations (use if, else if and else).

            Test Data
            Input a: 1
            Input b: 5
            Input c: 1
            Expected Output :
            The roots are -0.20871215252208009 and -4.7912878474779195
        */

//        ??????????????????????

        /*
            3. Take three numbers from the user and print the greatest number.

            Test Data
            Input the 1st number: 25
            Input the 2nd number: 78
            Input the 3rd number: 87
            Expected Output :
            The greatest: 87
        */
        int greatNum1 = 95;
        int greatNum2 = 78;
        int greatNum3 = 87;
        int greatestNum = 0;

        if (greatNum1 > greatNum2) {
            if (greatNum1 > greatNum3) {
                greatestNum = greatNum1;
            }
        }

        if (greatNum2 > greatNum1) {
            if (greatNum2 > greatNum3) {
                greatestNum = greatNum2;
            }
        }

        if (greatNum3 > greatNum1){
            if (greatNum3 > greatNum2) {
                greatestNum = greatNum3;
            }
        }

        System.out.println("The greatest number: " + greatestNum);

        /*
            4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
            Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
            or "large" if it exceeds 1,000,000.

            Test Data
            Input a number: 25
            Expected Output :
            Input value: 25
            Positive number
        */
        System.out.println("Type a decimal number.");
        float floatNum = scanner.nextFloat();

        if (floatNum == 0) {
            System.out.println("The number is zero!");
        }

        if (floatNum % 2 == 0) {
            if (floatNum < 1) {
                System.out.println("The number: " + floatNum + " is a small positive number");
            } else if( floatNum > 1_000_000) {
                System.out.println("The number: " + floatNum + " is a large positive number");
            } else {
                System.out.println("The number: " + floatNum + " is a positive number");
            }
        } else {
            if (floatNum < 1) {
                System.out.println("The number: " + floatNum + " is a small negative number");
            } else if( floatNum > 1_000_000) {
                System.out.println("The number: " + floatNum + " is a large negative number");
            } else {
                System.out.println("The number: " + floatNum + " is a negative number");
            }
        }

    }
}
