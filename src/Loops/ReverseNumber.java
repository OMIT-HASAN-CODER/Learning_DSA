package Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        System.out.println("The reversed number is: " + reverse);
    }
}
