package Loops;

import java.util.Scanner;

public class PowerLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter a number: ");
        int b = input.nextInt();

        int power = 1;
        for (int i = 1; i <= b; i++) {
            power *= a;
        }
        System.out.println(a + " raised to the power " + b + " is: " + power);
    }
}
