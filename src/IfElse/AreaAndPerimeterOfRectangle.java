package IfElse;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of a rectangle: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        if (area > perimeter) {
            System.out.println("Area is: " + area + "\n" + "Perimeter is: " + perimeter + "\nSo area is greater than the perimeter of the rectangle.");
        } else {
            System.out.println("Area is: " + area + "\n" + "Perimeter is: " + perimeter + "\nSo area is less than the perimeter of the rectangle.");
        }
    }
}
