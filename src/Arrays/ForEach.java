package Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int ele : arr) { //create a copy of each element
            ele *= 2;
            System.out.print(ele + " ");
        }
        System.out.println();

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
