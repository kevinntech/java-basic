package ch14.etc.stream.exam05;

import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){ return name; }
    public int getScore() { return score; }
}

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        studentList.stream()
                .mapToInt(s->s.getScore()) // Student::getScore
                .forEach(score-> System.out.println(score));
    }
}
