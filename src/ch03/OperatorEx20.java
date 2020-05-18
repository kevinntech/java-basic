package ch03;

public class OperatorEx20 {
    public static void main(String[] args) {
        // 피연산자의 부호를 모두 무시하고 나머지 연산을 한 결과에서 왼쪽 피연산자(나눠지는 수)의 부호를 붙이면 된다.
        System.out.println(-10%8);  // -2
        System.out.println(10%-8);  // 2
        System.out.println(-10%-8); // -2
    }
}
