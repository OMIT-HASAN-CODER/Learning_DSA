package IfElse;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        if (a <= b) {
            if (a <= c) {
                System.out.println("The smallest number is " + a);
            }
        } else {
            if (b <= c) {
                System.out.println("The smallest number is " + b);
            } else {
                System.out.println("The smallest number is " + c);
            }
        }
    }
}
