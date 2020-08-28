package ch14.etc.stream.exam04;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "김자바", "김철수", "김자바", "홍민철");

        // distinct 예제
        names.stream()
                .distinct()
                .forEach(name -> System.out.println(name));
        System.out.println();

        // filter 예제
        names.stream()
                .filter(n->n.startsWith("김"))
                .forEach(n-> System.out.println(n));
        System.out.println();

        // distinct, filter 예제
        names.stream()
                .distinct()
                .filter(n->n.startsWith("김"))
                .forEach(n-> System.out.println(n));
    }
}
