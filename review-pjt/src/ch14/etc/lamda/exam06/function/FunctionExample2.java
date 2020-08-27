package ch14.etc.lamda.exam06.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
    private static List<Student> list = Arrays.asList(
        new Student("홍길동", 90, 96),
        new Student("김자바", 95, 93)
    );

    // Student를 매개변수로 받아서 int으로 매핑해서 반환하는 함수형 인터페이스를 메서드의 매개변수로 지정
    public static double avg(ToIntFunction<Student> function){
        int sum = 0;

        for(Student student : list){
            sum += function.applyAsInt(student);
        }

        double avg = (double) sum / list.size();

        return avg;
    }

    public static void main(String[] args) {
        double englishAvg = avg( t -> t.getEnglishScore() );
        System.out.println("영어 평균 점수 : " + englishAvg);

        double mathAvg = avg(t -> t.getMathScore());
        System.out.println("수학 평균 점수 : " + mathAvg);
    }

}
