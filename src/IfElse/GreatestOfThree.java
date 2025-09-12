package IfElse;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is greater than " + b + " and " + c);
        } else if (b > a && b > c) {
            System.out.println(b + " is greater than " + a + " and " + c);
        } else {
            System.out.println(c + " is greater than " + a + " and " + b);
        }
    }
}
