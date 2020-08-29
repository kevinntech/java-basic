package ch14.etc.stream.exam10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class ReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("김자바", 95),
                new Student("김철수", 88)
        );


        // 첫 번째 방법
        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();

        // 두 번째 방법
        int sum2 = studentList.stream()
                .mapToInt(Student::getScore)
                .reduce((a, b) -> a + b)
                .getAsInt();

        // 세 번째 방법
        int sum3 = studentList.stream()
                .mapToInt(Student::getScore)
                .reduce(10, (a, b) -> a + b);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);

    }
}
