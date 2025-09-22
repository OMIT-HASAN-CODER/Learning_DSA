package Arrays;

import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {5, -8, 2, 67, 43, -97};

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] arr2 = new int[7];
        //default values
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        //input
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter the value of index " + i + ": ");
            arr2[i] = input.nextInt();
        }
        System.out.println();

        //output
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
