package IfElse;

import java.util.Scanner;

public class IsFourDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 999 && number < 10000) {
            System.out.println(number + " is a Four digit number");
        } else {
            System.out.println(number + " is not a Four digit number");
        }
    }
}
