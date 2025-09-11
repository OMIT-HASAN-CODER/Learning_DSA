package IfElse;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num >= 0) {
            System.out.println(num + " is the absolute value.");
        } else {
            System.out.println(num + " is a negative number.");
            System.out.println("The absolute value of " + num + " is: " + -num);
        }
    }
}
