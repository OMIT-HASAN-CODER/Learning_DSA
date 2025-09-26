package Arrays;

import java.util.Scanner;

public class MultiplyAndAdd {
    public static void main(String[] args) {
        int[] arr = getTheArray();
        printArray(arr);
        calculation(arr);
        printArray(arr);
    }

    public static int[] getTheArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of index " + i + ": ");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] calculation(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] *= 2;
            } else {
                arr[i] += 10;
            }
        }
        return arr;
    }
}
