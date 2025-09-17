package PatternPrinting;

import java.util.Scanner;

public class FlippedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= (number + 1) - i; j++) {
                System.out.print(((char) (j + 96)) + " ");
            }
            System.out.println();
        }
    }
}
