package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rotation no: ");
        int d = input.nextInt();

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(arr);

        int n = arr.length;
        d %= n;

        reverser(arr, 0, d - 1);
        reverser(arr, d, n - 1);
        reverser(arr, 0, n - 1);
        print(arr);
    }
    public static void reverser(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
