package Loops;

import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number == 0) {
            number = 5;
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println(count);
    }
}
