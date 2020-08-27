package ch14.etc.stream.exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
    private String name;
    private int score;

    public Student(String name, int score){
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

public class LamdaExpressionExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 90),
                new Student("김철수", 92)
        );

        Stream<Student> stream = list.stream();
        stream.forEach( student -> {
            String name = student.getName();
            int score = student.getScore();
            System.out.println(name + "-" + score);
        });
    }
}
