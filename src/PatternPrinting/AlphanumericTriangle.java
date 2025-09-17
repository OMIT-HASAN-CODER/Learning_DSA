package PatternPrinting;

import java.util.Scanner;

public class AlphanumericTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 26) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % 2 != 0) {
                        System.out.print(j + " ");
                    } else {
                        System.out.print(((char) (j + 64)) + " ");
                    }
                }
                System.out.println();
            }
        }  else {
            System.out.println("Invalid number");
        }
    }
}
