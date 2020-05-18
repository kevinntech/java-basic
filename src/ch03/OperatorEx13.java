package ch03;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

        // char c2 = c1+1;
        char c2 = 'a'+1;    // 'a'+1은 리터럴 간의 연산 이기 때문에 컴파일러가 미리 덧셈 연산을 수행 합니다.
                            // 그래서 컴파일 에러가 발생하지 않습니다.
        System.out.println(c2);
    }
}
