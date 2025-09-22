package Arrays;

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of index " + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println();

        int product = 1;
        for (int i = 0; i < size; i++) {
            product *= arr[i];
        }
        System.out.println("Product is: " + product);
    }
}
