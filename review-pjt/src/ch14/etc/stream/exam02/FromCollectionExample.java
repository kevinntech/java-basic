package ch14.etc.stream.exam02;

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

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }
}

public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("김자바", 20),
                new Student("유미선", 30)
        );

        Stream<Student> stream = studentList.stream();
        stream.forEach( s-> System.out.println(s.getName()));
    }
}
