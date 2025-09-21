package Methods;

public class Syntax {
    public static void dsa() {
        System.out.println("Hello DSA!");
        for (int i = 1; i <= 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        method3();
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
        method();
    }
    public static void method() {
        System.out.println("First method called");
        dsa();
    }
    public static void method2() {
        System.out.println("Third method called");
    }
    public static void method3() {
        System.out.println("Second method called");
        method2();
    }
}
