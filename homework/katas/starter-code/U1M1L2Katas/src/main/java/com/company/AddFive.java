package com.company;

import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int num1 = Integer.parseInt(scan.nextLine());

        System.out.println("Please enter your second number");
        int num2 = Integer.parseInt(scan.nextLine());

        System.out.println("Please enter your third number");
        int num3 = Integer.parseInt(scan.nextLine());

        System.out.println("Please enter your fourth number");
        int num4 = Integer.parseInt(scan.nextLine());

        System.out.println("Please enter your fiveth number");
        int num5 = Integer.parseInt(scan.nextLine());

        int sum = num1 + num2 + num3 + num4 + num5 ;
        System.out.println("The sum of your numbers is  " + sum);

    }
}
