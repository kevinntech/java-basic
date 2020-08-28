package ch14.etc.stream.exam01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김철수" , "감자바");

        // Java 7 이전 코드 (Iterator 이용)
        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }

        System.out.println();

        // Java 8 이후 코드 (Stream 이용)
        Stream<String> stream = list.stream(); // list에서 스트림 객체를 얻어낸다.
        stream.forEach( name -> System.out.println(name)); // name이라는 매개변수에 list의 요소(문자열)이 대입 됨
    }
}
