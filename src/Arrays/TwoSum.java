package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of index " + i + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = input.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(target + " is the sum of " + arr[i] + " and " + arr[j]);
                }
            }
        }
        System.out.println("Target invalid");
    }
}
