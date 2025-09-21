package PatternPrinting;

import java.util.Scanner;

public class SnakeAndFox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i % 2 == 0) {
                    if (i % 4 == 0) {
                        if (j == 1) {
                            System.out.print("# ");
                        } else {
                            System.out.print(". ");
                        }
                    } else if (j == columns){
                        System.out.print("# ");
                    } else {
                        System.out.print(". ");
                    }
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
