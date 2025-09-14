package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                System.out.println("Composite number.");
                break;
            }
        }
    }
}
