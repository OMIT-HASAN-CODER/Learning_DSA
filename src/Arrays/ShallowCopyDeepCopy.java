package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] x = arr; //x is shallow copy of arr
        x[0] = 10;
        System.out.println(arr[0]);
        int[] y = Arrays.copyOf(arr, arr.length); //y is deep copy of arr
        y[0] = 10;
        System.out.println(arr[0]);
    }
}
