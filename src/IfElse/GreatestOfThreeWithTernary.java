package IfElse;

import java.util.Scanner;

public class GreatestOfThreeWithTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        System.out.println("The greatest number is: " + ((a >= b) ? (a >= c) ? a : c : (b >= c) ? b : c ));
    }
}
