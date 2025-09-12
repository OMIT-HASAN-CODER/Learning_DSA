package IfElse;

import java.util.Scanner;

public class LocationOfPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        double x = input.nextDouble();
        System.out.print("Enter value of y: ");
        double y = input.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Location of point is the origin.");
        } else if (y == 0) {
            System.out.println("Location of point is on the x-axis.");
        } else if (x == 0) {
            System.out.println("Location of point is on the y-axis.");
        } else if (x > 0 && y > 0) {
            System.out.println("Location of point is in the 1st Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("Location of point is in the 2nd Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("Location of point is in the 3rd Quadrant.");
        } else {
            System.out.println("Location of point is in the 4th Quadrant.");
        }
    }
}
