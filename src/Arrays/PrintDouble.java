package Arrays;

import java.util.Scanner;

public class PrintDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of index " + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(2 * arr[i] + " ");
        }
    }
}
