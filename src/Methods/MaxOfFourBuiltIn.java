package Methods;

import java.util.Scanner;

public class MaxOfFourBuiltIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int max1 = Math.max(a, b);
        int max2 = Math.max(c, d);

        System.out.println("The maximum number is: " + Math.max(max1, max2));
    }
}
