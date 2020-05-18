package ch03;

public class OperatorEx15 {
    public static void main(String[] args) {
        // 대문자와 소문자 간의 코드 값 차이는 10진수로 32 입니다.
        char lowerCase = 'a';
        char upperCase = (char) (lowerCase - 32);   // char형과 int형 간의 연산 결과는 int형이므로 연산 후 char형으로
                                                    // 다시 형 변환 해야 합니다.
        System.out.println(upperCase);
    }
}
