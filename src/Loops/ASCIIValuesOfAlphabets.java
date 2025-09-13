package Loops;

public class ASCIIValuesOfAlphabets {
    public static void main(String[] args) {
        System.out.println("From A to Z");
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i + " = " + i);
        }
        System.out.println();
        System.out.println("From a to z");
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char) i + " = " + i);
        }
    }
}
