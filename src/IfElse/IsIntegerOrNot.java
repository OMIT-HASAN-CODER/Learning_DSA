package IfElse;

import java.util.Scanner;

public class IsIntegerOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        int numInt = (int) num;

        if (numInt == num) {
            System.out.println(numInt + " is an integer.");
        } else {
            System.out.println(num + " is not an integer.");
        }
    }
}
