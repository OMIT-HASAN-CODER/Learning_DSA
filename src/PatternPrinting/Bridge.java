package PatternPrinting;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= (2 * number) - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= number - 1; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= number - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
