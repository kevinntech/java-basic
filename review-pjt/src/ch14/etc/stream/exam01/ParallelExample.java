package ch14.etc.stream.exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* 병렬 스트림 예제 */
public class ParallelExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김철수" , "감자바" , "람다식" , "김병렬");

        //
        Stream<String> stream = list.stream();
        stream.forEach(name -> print(name)); // [메서드 참조] ParallelExample::print

        System.out.println();
        Stream<String> parallelStreams = list.parallelStream(); // 병렬 스트림을 얻어낸다.
        parallelStreams.forEach(name -> print(name)); // [메서드 참조] ParallelExample::print
    }

    public static void print(String str) {
        System.out.println(str + ":" + Thread.currentThread().getName()); // 현재 스레드의 이름을 출력
    }
}
