package Arrays;

public class SortOfZerosOnesAndTwos {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int numberOfZeros = 0;
        int numberOfOnes = 0;

        for (int ele : arr) {
            if (ele == 0) {
                numberOfZeros++;
            } else if (ele == 1) {
                numberOfOnes++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < numberOfZeros) {
                arr[i] = 0;
            } else if (i < numberOfZeros + numberOfOnes){
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
