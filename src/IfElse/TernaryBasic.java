package IfElse;

import java.util.Scanner;

public class TernaryBasic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println(number + " is " + ((number % 2 == 0) ? "Even" : "Odd"));
    }
}
