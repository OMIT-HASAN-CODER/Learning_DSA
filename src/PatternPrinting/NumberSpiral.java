package PatternPrinting;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 2 * number - 1; i++) {
            for (int j = 1; j <= 2 * number - 1; j++) {
                int a = i, b = j;
                if (i > number) {
                    a = 2 * number - i;
                } if (j > number){
                    b =  2 * number - j;
                }
                System.out.print(Math.min(a, b) + " ");
            }
            System.out.println();
        }
    }
}
