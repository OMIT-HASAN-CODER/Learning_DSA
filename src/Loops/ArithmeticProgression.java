package Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of nth term for arithmetic progression: ");
        int n = input.nextInt();
        System.out.print("Enter the first value for arithmetic progression: ");
        int a = input.nextInt();
        System.out.print("Enter common difference for arithmetic progression: ");
        int d = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a += d;
        }
    }
}
