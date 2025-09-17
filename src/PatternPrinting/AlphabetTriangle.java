package PatternPrinting;

import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 26) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(((char) (j + 64)) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}
