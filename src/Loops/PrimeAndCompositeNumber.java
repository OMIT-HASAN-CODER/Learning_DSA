package Loops;

import java.util.Scanner;

public class PrimeAndCompositeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        boolean flag = true; //true means prime

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false; //false means composite
                break;
            }
        }
        if (n == 1) {
            System.out.println("Neither a prime nor a composite number.");
        } else if (!flag) {
            System.out.println("Composite number.");
        } else {
            System.out.println("Prime number.");
        }
    }
}
