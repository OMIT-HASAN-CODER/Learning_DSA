package IfElse;

import java.util.Scanner;

public class isSmaller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (-number < 69) {
            System.out.println(number + "'s magnitude is less than 69.");
        } else if (-number == 69) {
            System.out.println(number + "'s magnitude is equal to 69.");
        } else {
            System.out.println(number + "'s magnitude is greater than 69.");
        }
    }
}
