package Arrays;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();

        boolean flag = false;
        int[] arr = {10, 12, 3, 2, 5, 9, 15, 10, 7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(a + " is exist in the array.");
        } else {
            System.out.println(a + " is not exist in the array.");
        }
    }
}
