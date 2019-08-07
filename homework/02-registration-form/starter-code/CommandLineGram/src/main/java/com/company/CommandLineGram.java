package com.company;

import java.util.Scanner;

public class CommandLineGram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" what is your firtname");
        String firstName = scan.nextLine();

        System.out.println(" what is your lastname");
        String lastName = scan.nextLine();

        System.out.println(" what is your email");
        String email = scan.nextLine();

        System.out.println(" what is your twitter handle");
        String twitterHandle = scan.nextLine();

        System.out.println(" what is your age");
        Integer age  = (Integer)scan.nextInt();
        scan.nextLine();

        System.out.println(" what is your Country");
        String country = scan.nextLine();

        System.out.println(" what is your profession");
        String profession = scan.nextLine();

        System.out.println(" what is your favorite operating system");
        String favOperatingSystem = scan.nextLine();

        System.out.println(" what is your favorite programming language");
        String favProgLanguage = scan.nextLine();

        System.out.println(" what is your favorite computer scientist");
        String favCompScientist = scan.nextLine();

        System.out.println(" what is your favorite keyboard shortcuts");
        String favKeyboardShortcut = scan.nextLine();

        System.out.println("Have you ever built your own computer?  ");
        String yourOwnComputer = scan.nextLine();

        System.out.println("If you could be any superhero, who would it be?");
        String superHero = scan.nextLine();


        System.out.format("%s", firstName + "\n");
        System.out.format("%s", lastName + "\n" );
        System.out.format("%s", email + "\n");
        System.out.format("%s", twitterHandle + "\n");
//      System.out.format("%d", age + "\n");
        System.out.format("%d%n", age);
        System.out.format("%s", country + "\n");
        System.out.format("%s", profession + "\n");
        System.out.format("%s", favOperatingSystem + "\n");
        System.out.format("%s", favProgLanguage + "\n");
        System.out.format("%s", favCompScientist + "\n");
        System.out.format("%s", favKeyboardShortcut + "\n");
        System.out.format("%s", yourOwnComputer + "\n");
        System.out.format("%s", superHero + "\n");


    }

}
