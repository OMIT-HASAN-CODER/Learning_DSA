package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        for (int i = 1; i <= rows; i++) { //number of lines
            for (int j = 1; j <= columns; j++) { //number of stars per line
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
