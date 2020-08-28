package ch14.etc.stream.exam02;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100); // 1~100까지 범위의 연속된 정수를 스트림으로 생성
        stream.forEach(a -> sum += a); // 정수를 하나씩 가져와서 sum에 누적한다.
        System.out.println("총합 : " + sum);
    }
}
