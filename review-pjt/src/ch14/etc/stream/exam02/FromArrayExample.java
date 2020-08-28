package ch14.etc.stream.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "김자바", "김미나"};
        Stream<String> stringStream = Arrays.stream(strArray); // String.of // Arrays.stream(strArray)
        stringStream.forEach(s -> System.out.println(s));
        System.out.println();

        int[] intArray = { 1, 2, 3, 4, 5 };
        IntStream intStream = Arrays.stream(intArray); // IntStream.of(intArray) 도 가능
        intStream.forEach(i -> System.out.println(i));
    }
}
