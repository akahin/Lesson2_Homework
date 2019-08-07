package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {
        Scanner scanTwo = new Scanner(System.in);
        System.out.println("Please enter your first numer");
        int num1 = scanTwo.nextInt();

        System.out.println("Please enter your second numer");
        int num2 = scanTwo.nextInt();

        int remainder = num1 - num2;
        System.out.println("second number minus first number is " + remainder);

    }
}
