package ch14.etc.stream.exam01;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("김철수", 20),
                new Student("유미선", 30)
        );

        /* 
            mapToInt() : 중간 연산 
            average() : 최종 연산 
            getAsDouble() : 최종 연산의 반환 타입이 Optional 이므로 값을 가져 오기 위해서 get()을 사용 
         */
        double avg = studentList.stream()
                .mapToInt(s -> s.getScore())    // [메서드 참조] Student::getScore
                .average()  //
                .getAsDouble();

        System.out.println("평균 점수 : " + avg);
    }
}
