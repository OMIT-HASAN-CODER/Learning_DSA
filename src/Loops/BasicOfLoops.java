package Loops;

public class BasicOfLoops {
    public static void main(String[] args) {
        System.out.println("Using for loop--");
        for (int i = 1; i <= 10  ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Using while loop--");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        System.out.println("Using do while loop--");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);
        System.out.println();
    }
}
