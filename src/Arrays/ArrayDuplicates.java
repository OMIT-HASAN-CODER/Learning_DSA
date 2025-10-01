package Arrays;

import java.util.ArrayList;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3, 4, 1, 5};
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ans.add(arr[i]);
                }
            }
        }
        System.out.println(ans);
    }
}
