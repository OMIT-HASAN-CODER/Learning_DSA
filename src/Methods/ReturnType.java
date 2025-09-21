package Methods;

public class ReturnType {
    public static int sum(int a, int b, int c) {
        System.out.print(a + " + " + b + " + " + c + " = ");
        return a + b + c;
    }
    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        int result = sum(6, 9, -3);
        System.out.print(result);
        System.out.println();
        System.out.println("Maximum number is: " + max(6, 9, -3));
    }
}
