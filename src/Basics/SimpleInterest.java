package Basics;

import javax.xml.transform.Source;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter time: ");
        double time = input.nextDouble();

        double simpleInterest = (principal * interestRate * time) / 100;
        System.out.println("The simple interest is: " + simpleInterest);
    }
}
