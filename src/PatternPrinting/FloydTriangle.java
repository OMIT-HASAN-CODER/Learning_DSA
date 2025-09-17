package PatternPrinting;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int a = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
