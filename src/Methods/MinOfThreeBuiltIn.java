package Methods;

import java.util.Scanner;

public class MinOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("The minimum number is: " + Math.min(Math.min(a, b), c));
    }
}
