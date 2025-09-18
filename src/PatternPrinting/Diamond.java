package PatternPrinting;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int nsp = number - 1, nst = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <=  nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp --;
            nst += 2;
            System.out.println();
        }

        nsp = 1;
        nst = 2 * number -3;
        for (int i = 1; i <= number - 1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp ++;
            nst -= 2;
            System.out.println();
        }
    }
}
