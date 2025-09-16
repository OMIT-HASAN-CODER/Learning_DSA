package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //for negative number
//        if (number < 0) {
//            number = -number;
//        }
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum is: " + ((sum > 0) ? sum : -sum)); //for negative sum
    }
}
