package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num1 = scan.nextInt();
        num1 += 5;
        num1 *= 2;
        System.out.println(num1);

    }
}
