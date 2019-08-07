package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
        Scanner intScan = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num1 = intScan.nextInt();
        System.out.println( ( num1 * 2 ) + 5 );

    }
}
