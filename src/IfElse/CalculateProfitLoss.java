package IfElse;

import java.util.Scanner;

public class CalculateProfitLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double costPrice = input.nextDouble();
        System.out.print("Enter selling price: ");
        double sellingPrice = input.nextDouble();

        if (sellingPrice > costPrice) {
            System.out.println("Profit is: " + (sellingPrice - costPrice) + ". and profit percentage is: " + ((sellingPrice - costPrice) / costPrice) * 100 + "%");
        } else if (sellingPrice < costPrice) {
            System.out.println("Loss is: " + (costPrice - sellingPrice) + ". and loss percentage is: " + ((costPrice - sellingPrice) / costPrice) * 100 + "%");
        } else {
            System.out.println("No profit no loss.");
        }
    }
}
