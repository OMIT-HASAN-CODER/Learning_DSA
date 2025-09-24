package Arrays;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6, 54, 8, 98, 10, 234, 109, 1, 3};
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
    }
}
