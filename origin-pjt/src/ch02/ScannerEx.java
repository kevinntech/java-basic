package ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력 해주세요. >");
        String input  = sc.nextLine();
        int num = Integer.parseInt(input);  // 입력받은 문자열을 int 타입의 정수로 변환

        System.out.println("입력 내용 : " + input);
        System.out.printf("num=%d%n", num);

    }
}
