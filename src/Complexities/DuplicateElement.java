package Complexities;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 4};

        //approach 1 --> brute force
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println(arr[j] + " is the duplicate element.");
//                    break;
//                }
//            }
//        }

        //approach 2 --> marking in another array
        boolean[] flag = new boolean[arr.length + 1];
        for (int ele : arr) {
            if (flag[ele]) {
                System.out.println(ele + " is the duplicate element.");
            } else {
                flag[ele] = true;
            }
        }
    }
}
