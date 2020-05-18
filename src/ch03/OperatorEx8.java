package ch03;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b; // a * b = 2,000,000,000,000?
                        // int 타입과 int 타입의 연산 결과는 int 타입 이다.
        System.out.println(c);
    }
}
