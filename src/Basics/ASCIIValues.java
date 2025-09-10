package Basics;

import java.util.Scanner;

public class ASCIIValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch = input.next().charAt(0);

        System.out.println("The ASCII value of " + ch + " is: " + (int) ch);

        System.out.println("Enter a ASCII value: ");
        int number = input.nextInt();

        System.out.println("The Character value of " + number + " is: " + (char) number);

    }
}
