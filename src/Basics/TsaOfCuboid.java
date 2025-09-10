package Basics;

public class TsaOfCuboid {
    public static void main(String[] args) {
        double l = 5;
        double w = 3;
        double h = 2;
        double tsa = 2 * ((l * w) + (w * h) + (l * h));
        System.out.println(tsa);
    }
}
