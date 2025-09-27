package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
