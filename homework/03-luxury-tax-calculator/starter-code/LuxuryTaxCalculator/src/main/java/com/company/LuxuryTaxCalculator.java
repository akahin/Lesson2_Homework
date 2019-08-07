package com.company;

import java.util.Scanner;

public class LuxuryTaxCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the salary for Player 1");
        int salary1 = Integer.parseInt(scan.nextLine());

        System.out.println("enter the salary for Player 2");
        int salary2 = Integer.parseInt(scan.nextLine());

        System.out.println("enter the salary for Player 3");
        int salary3 = Integer.parseInt(scan.nextLine());

        int totalSalary = salary1 + salary2 + salary3 ;
        System.out.println("total salary is " + totalSalary);

        if (totalSalary > 40000) {
            double luxuryTax = (totalSalary - 40000) * 0.18 ;
            System.out.println("cost of the luxury tax is  $" + luxuryTax);
        }
    }
}
