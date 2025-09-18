package PatternPrinting;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
