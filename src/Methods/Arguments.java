package Methods;

public class Arguments {
    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void max(int a, int b, int c) {
        System.out.println(Math.max(Math.max(a, b), c));
    }
    public static void main(String[] args) {
        sum(6, 9, -3);
        max(6, 9, -3);
    }
}
