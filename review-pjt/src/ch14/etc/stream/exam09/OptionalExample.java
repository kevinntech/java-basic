package ch14.etc.stream.exam09;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /*
        double avg = list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .getAsDouble(); // 요소가 없으므로 예외 발생
         */

        // 첫 번째 방법
        OptionalDouble optional = list.stream()
                                    .mapToInt(Integer :: intValue)
                                    .average();

        if(optional.isPresent()){
            System.out.println("방법 1_평균: " + optional.getAsDouble());
        }else{
            System.out.println("방법 1_평균: 0.0");
        }

        // 두 번째 방법
        double avg = list.stream()
                        .mapToInt(Integer :: intValue)
                        .average()
                        .orElse(0.0); // 결과 값이 있을 경우에는 그 값을 반환하고 결과 값이 없을 경우 대체 값을 반환
        System.out.println("방법 2_평균: " + avg);

        // 세 번째 방법
        list.add(2);
        list.add(4);

        list.stream()
            .mapToInt(Integer :: intValue)
            .average()
            .ifPresent(a -> System.out.println("방법 3_평균: " + a)); // ifPresent() : Optional 객체의 값이 존재한다면 true를 반환
    }
}
