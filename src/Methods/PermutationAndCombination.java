package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static int factorial(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("Enter the value of r: ");
        int r = input.nextInt();

        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        int npr = factorial(n) / factorial(n - r);
        System.out.println("Permutation is: " + npr);
        System.out.println("Combination is: " + ncr);
    }
}
