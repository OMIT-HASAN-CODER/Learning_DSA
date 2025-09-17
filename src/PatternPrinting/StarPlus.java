package PatternPrinting;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 != 0) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == (number + 1) / 2 || j == (number + 1) / 2) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Only odd numbers are allowed.");
        }
    }
}
