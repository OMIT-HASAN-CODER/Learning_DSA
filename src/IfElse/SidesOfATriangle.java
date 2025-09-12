package IfElse;

import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st side of triangle: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd side of triangle: ");
        int b = input.nextInt();
        System.out.print("Enter 3rd side of triangle: ");
        int c = input.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }
    }
}
