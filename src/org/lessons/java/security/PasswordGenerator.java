package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter your name: ");
            String name = input.nextLine();

            System.out.println("Enter your surname: ");
            String surName = input.nextLine();

            System.out.println("Enter your birth day: ");
            int birthDay = input.nextInt();
            input.nextLine();

            System.out.println("Enter your birth month: ");
            int birthMonth = input.nextInt();
            input.nextLine();

            System.out.println("Enter your birth year: ");
            int birthYear = input.nextInt();
            input.nextLine();

            System.out.println("Enter your favourite color: ");
            String favColor = input.nextLine();

            System.out.println("name: " + name);
            System.out.println("surname: " + surName);
            System.out.println("favourite color: " + favColor);
            System.out.println("birthday: " + birthDay + "/" + birthMonth + "/" + birthYear);

            int birthSum = birthDay + birthMonth + birthYear;

            System.out.println("password: " + name + "-" + surName + "-" + favColor + "-" + birthSum);
        }
    }
}
