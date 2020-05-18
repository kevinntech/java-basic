package ch02;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);    // 10 -> 10

        i = 300;
        b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);    // 오버플로우 발생해서

        b = 10;
        i = (int) b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);    // 10 -> 10

        b = -2;
        i = (int) b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);    // -2 -> -2

        System.out.println("i=" + Integer.toBinaryString(i));       // 1111111~~~
    }
}
