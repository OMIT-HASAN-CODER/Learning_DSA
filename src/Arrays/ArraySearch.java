package Arrays;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int target = input.nextInt();

        int flag = -1;
        int[] arr = {10, 12, 3, 2, 5, 9, 15, 10, 7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = i;
                break;
            }
        }
        if (flag != -1) {
            System.out.println(target + " is found in the array at index " + flag);
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }
}
