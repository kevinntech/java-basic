package ch14.etc.exam06.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student{
    private String name;
    private int englishScore;
    private int mathScore;

    public Student(String name, int englishScore, int mathScore){
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}

public class FunctionExample {
    private static List<Student> list = Arrays.asList(
        new Student("홍길동", 90, 96),
        new Student("김자바", 95, 93)
    );

    // Student를 매개변수로 받아서 String으로 매핑해서 반환하는 함수형 인터페이스를 메서드의 매개변수로 지정
    public static void printString(Function<Student, String> function){

        // list에서 Student 객체가 student 변수에 하나씩 대입된다.
        for(Student student : list){
            System.out.print(function.apply(student) + " ");
        }
        System.out.println();
    }

    // Student를 매개변수로 받아서 int으로 매핑해서 반환하는 함수형 인터페이스를 메서드의 매개변수로 지정
    public static void printInt(ToIntFunction<Student> function){

        for(Student student : list){
            System.out.print(function.applyAsInt(student) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("[학생 이름]");
        printString(t -> t.getName()); // Student 객체를 매개변수로 받아서 학생의 이름을 반환

        System.out.println("[영어 점수]");
        printInt(t -> t.getEnglishScore()); // Student 객체를 매개변수로 받아서 학생의 영어 점수를 반환

        System.out.println("[수학 점수]");
        printInt(t -> t.getMathScore()); // Student 객체를 매개변수로 받아서 학생의 수학 점수를 반환
    }
}
