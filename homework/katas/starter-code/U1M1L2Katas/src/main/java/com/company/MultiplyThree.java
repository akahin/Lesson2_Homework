package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        System.out.println("please enter your first number");
        int num1 = Integer.parseInt(numScan.nextLine());

        System.out.println("Please enter your second number");
        int num2 = Integer.parseInt(numScan.nextLine());

        System.out.println("Please enter your third number");
        int num3 = Integer.parseInt(numScan.nextLine());

        int product = num1 * num2 * num3;
        System.out.println("the product of your three numbers is  " + product);

    }
}