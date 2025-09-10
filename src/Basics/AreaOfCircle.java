package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = input.nextDouble();
        double a = 3.141592 * r * r;
        System.out.println("\nArea of Circle is: " + a);
    }
}
