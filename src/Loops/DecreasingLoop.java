package Loops;

import java.util.Scanner;

public class DecreasingLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
