package Arrays;

public class SegregateOfZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 0};
        int numberOfZeros = 0;

        for (int ele : arr) {
            if (ele == 0) {
                numberOfZeros ++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < numberOfZeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
