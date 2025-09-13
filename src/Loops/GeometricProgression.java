package Loops;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of nth term for geometric progression: ");
        int n = input.nextInt();
        System.out.print("Enter the first value for geometric progression: ");
        int a = input.nextInt();
        System.out.print("Enter common ratio for geometric progression: ");
        int r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a *= r;
        }
    }
}
