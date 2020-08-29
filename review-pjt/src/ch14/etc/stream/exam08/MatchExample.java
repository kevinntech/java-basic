package ch14.etc.stream.exam08;

import java.util.Arrays;
import java.util.stream.Stream;

public class MatchExample {
    public static void main(String[] args) {
        int[] intArr = { 2, 4, 6 };

        boolean result = Arrays.stream(intArr)
                            .allMatch(a -> a%2 == 0);
        System.out.println("스트림의 모든 요소는 2의 배수인가? " + result);

        result = Arrays.stream(intArr)
                    .anyMatch(a -> a%3 == 0);
        System.out.println("스트림의 요소 중 최소 한 개의 요소는 3의 배수인가? " + result);

        result = Arrays.stream(intArr)
                .noneMatch(a -> a%3 == 0);
        System.out.println("스트림의 모든 요소에서 3의 배수는 없는가? " + result);
    }
}
