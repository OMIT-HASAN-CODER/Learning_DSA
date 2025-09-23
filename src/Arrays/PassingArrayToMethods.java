package Arrays;

public class PassingArrayToMethods {
    public static void change(int[] arr) {
        arr[2] = 99;
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 29, 38};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
}
