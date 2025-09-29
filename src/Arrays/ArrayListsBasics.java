package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(arr.get(4)); //arr[4]

        arr.set(4, 5); // arr[4] = 5;
        System.out.println(arr);

        int n = arr.size(); //arr.length
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        arr.add(6);
        arr.add(1, 9);
        System.out.println(arr);

        arr.remove(arr.size() -1 );
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);

        int i = 0, j = arr.size() - 1;
        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);

        ArrayList<Character> crr = new ArrayList<>();
        ArrayList<Double> drr = new ArrayList<>();
        ArrayList<String> srr = new ArrayList<>();
    }
}
