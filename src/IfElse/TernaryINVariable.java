package IfElse;

import java.util.Scanner;

public class TernaryINVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int variable = (number >= 0) ? 100 : 0;
        System.out.println(variable);
    }
}