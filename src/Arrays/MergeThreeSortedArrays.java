package Arrays;

public class MergeThreeSortedArrays {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9, 12, 20};
        int[] b = {1, 3, 4, 7, 8, 15, 16, 17};
        int[] c = {10, 11, 13, 14, 18, 19};
        int[] d = new int[a.length + b.length + c.length];
        print(d);
        merge(d, a, b, c);
        print(d);
    }

    public static void merge(int[] d, int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0, l =0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] < b[j] && a[i] < c[k]) {
                d[l] = a[i];
                i++;
            } else if (b[j] < c[k] && b[j] < a[i]) {
                d[l] = b[j];
                j++;
            } else {
                d[l] = c[k];
                k++;
            }
            l++;
        }
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                d[l] = a[i];
                i++;
            } else {
                d[l] = b[j];
                j++;
            }
            l++;
        }
        while (i < a.length && k < c.length) {
            if (a[i] < c[k]) {
                d[l] = a[i];
                i++;
            } else {
                d[l] = c[k];
                k++;
            }
            l++;
        }
        while (j < b.length && k < c.length) {
            if (b[j] < c[k]) {
                d[l] = b[j];
                j++;
            } else {
                d[l] = c[k];
                k++;
            }
            l++;
        }
        while (i < a.length) {
            d[l] = a[i];
            i++;
            l++;
        }
        while (j < b.length) {
            d[l] = b[j];
            j++;
            l++;
        }
        while (k < c.length) {
            d[l] = c[k];
            k++;
            l++;
        }
    }

    public static void print(int[] d) {
        for (int ele : d) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
