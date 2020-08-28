package ch14.etc.stream.exam05;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        // 문자열을 여러 개의 단어로 만들어 여러 단어로 구성된 새로운 스트림을 만든다.
        List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");

        inputList1.stream()
                .flatMap(data -> Arrays.stream(data.split(" "))) // split()로 문자열 배열을 얻은 다음, 이 배열을 stream으로 만들어 반환
                .forEach(word -> System.out.println(word));
        System.out.println();

        List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
        inputList2.stream()
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for(int i=0; i<strArr.length; i++){
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(intArr);
                }) // String 객체를 여러 개의 int 요소로 구성된 IntStream으로 반환한다.
                .forEach(number -> System.out.println(number));

    }
}
