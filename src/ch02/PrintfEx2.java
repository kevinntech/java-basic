package ch02;

public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;
       /*
            %n : 줄바꿈
            %f : 부동 소수점의 형식으로 출력 , 기본적으로 소수점 아래 6 자리까지만 출력
            %e : 지수 형태로 출력
            %g : 값을 간략하게 표현할 때 사용
         */
        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d);    // 전체 14자리 중 소수점 아래 10자리

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url); // .을 붙이면 문자열의 일부만 출력할 수 있다.
    }
}
