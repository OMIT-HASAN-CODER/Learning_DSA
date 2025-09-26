package Arrays;

import java.util.Scanner;

public class SecondMaximum {
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

        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("The second maximum element is: " + secondMax);
    }
}
