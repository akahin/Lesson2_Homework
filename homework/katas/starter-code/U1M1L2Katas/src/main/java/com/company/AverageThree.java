package com.company;

import java.util.Scanner;
public class AverageThree {

    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int num1 = Integer.parseInt(numScan.nextLine());

        System.out.println("Please enter your second number");
        int num2 = Integer.parseInt(numScan.nextLine());

        System.out.println("Please enter your third number");
        int num3 = Integer.parseInt(numScan.nextLine());

        double sum = num1 + num2 + num3;
        double average = sum / 3;
        //System.out.println(" the average of your three numbers is "+ average);
        System.out.format("%.2f%n", average);
    }
}
