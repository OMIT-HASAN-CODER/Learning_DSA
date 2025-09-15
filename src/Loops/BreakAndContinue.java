package Loops;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". ");
            if (i == 5) {
                System.out.println("Not Today.");
                continue;
            }
            System.out.println("Good Morning.");
            if (i == 7) {
                System.out.println("Reached the weekly limit.");
                break;
            }
        }
    }
}
