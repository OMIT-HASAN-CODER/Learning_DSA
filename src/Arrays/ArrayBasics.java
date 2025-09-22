package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {6, 19, 7, 69, 9, 171, 5};
        //indexing
        System.out.println(arr[5]);
        //updating elements
        arr[4] = 96;
        System.out.println(arr[4]);

        int[] arr2 = new int[4];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 150;
        arr2[3] = -8;
        System.out.println(arr2[3]);
    }
}
