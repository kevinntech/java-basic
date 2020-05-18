package ch03;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a+b; // 컴파일 에러가 발생한다.
        byte c = (byte)(a+b);
        System.out.println(c);

    }
}
