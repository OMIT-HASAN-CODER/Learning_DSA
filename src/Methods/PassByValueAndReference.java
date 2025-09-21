package Methods;

public class PassByValueAndReference {
    public static void changeValue(int x) {
        x = 10;
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        changeValue(x);
        System.out.println(x);
    }
}
