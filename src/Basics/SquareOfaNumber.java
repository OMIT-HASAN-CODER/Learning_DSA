package Basics;

import java.util.Scanner;

public class SquareOfaNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Square of " + number + " is: " + number * number);
    }
}
