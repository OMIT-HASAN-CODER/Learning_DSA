package Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        for (int i = 2; i <= (3*n - 1); i += 3) {
            System.out.println(i);
        }
    }
}
