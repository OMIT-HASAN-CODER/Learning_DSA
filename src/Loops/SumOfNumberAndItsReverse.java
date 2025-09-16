package Loops;

import java.util.Scanner;

public class SumOfNumberAndItsReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int reverse = 0;
        int sum = number;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        sum += reverse;
        System.out.println("Sum is: " + sum);
    }
}
