package com.company;

import java.util.Scanner;

public class RectPavingCompany {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter width of the driveway in feet");
        int myWidth = scanner.nextInt();

        System.out.println("Please enter the length of the driveway feet");
        int myLength = scanner.nextInt();


        int areaDriveway = myWidth * myLength;
        System.out.println("The area is " + areaDriveway + "ft squared");


        int perimterOfDriveWay = myWidth + myLength;

        System.out.println("The perimeter is " + perimterOfDriveWay + " ft");


        double cementCost = areaDriveway * 12.50;
        double framingFooter = 8.25 * 12;

        System.out.println("The total cement cost is " + cementCost);
        System.out.println("The footer cost is " + framingFooter);


        System.out.println("Please enter cost of the cement");
        double userPassedCement = scanner.nextDouble();

        System.out.println("Please enter cost of framing/footers");
        double userPassedFooter = scanner.nextDouble();
        
        double newCementCost = areaDriveway * userPassedCement;
        double newFooterCost = userPassedFooter * 12;

        System.out.println("The total cement cost is " + newCementCost);
        System.out.print("The footer cost is " + newFooterCost);


    }


}

